package threadTest.test09;

import java.util.ArrayList;
import java.util.Date;

/**
 * 仓库存放货物
 */
public class Repository {
    //库存数组
    private ArrayList<Object> goods = new ArrayList<>(100);
    //仓库容量
    public final int MAX_SIZE = 10;

    //增加货物方法，调用时，加入 对象互斥锁，其他线程不能同步操作
    public synchronized void addGoods(Object obj) {
        //while轮询，判别是否满仓，若满仓，则进入等待，释放对象互斥锁，其他线程可操作
        while (goods.size() == MAX_SIZE) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("生产等待中。。。");
            }
        }

        //通过上方轮询，说明没满仓，唤醒该线程，即再次加上 对象互斥锁
        notify();

        goods.add(obj);
        System.out.println(new Date() +" 已生产新货物。库存量：" + goods.size());
    }

    //消费货物方法
    public synchronized void delGoods() {
        while (goods.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("消费等待中。。。");
            }
        }

        notify();

        goods.remove(0);
        System.out.println(new Date()+" 已经消费货物。库存量：" + goods.size());
    }
}

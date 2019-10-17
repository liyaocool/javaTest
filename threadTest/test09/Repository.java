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
    public void addGoods(Object obj) {
        synchronized (this) {
            //若满仓，则进入等待，释放对象互斥锁，其他线程可操作
            while (goods.size() == MAX_SIZE) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("生产等待中。。。");
                }
            }
            //若跳过上方判断，说明没满仓，唤醒wait队列里第一个线程
            goods.add(obj);
            notify();
            System.out.println(new Date() + " 已生产新货物。库存量：" + goods.size());
        }
    }

    //消费货物方法
    public void delGoods() {
        synchronized (this) {
            while (goods.size() == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            goods.remove(0);
            notify();
            System.out.println(new Date() + " 已经消费货物。库存量：" + goods.size());
        }


    }
}

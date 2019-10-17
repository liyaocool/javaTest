package threadTest.test09;

import java.util.Date;

/**
 * 生产者，向仓库里新增物品
 */
public class Productor implements Runnable {
    private Repository repository;

    public Productor(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void run() {
        while (true){
            Object obj = new Date(); //这里把时间对象当作 货物 添加到 仓库数组里
            repository.addGoods(obj);

            //1秒生产一个
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

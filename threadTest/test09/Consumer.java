package threadTest.test09;

/**
 * 消费者,从仓库里消耗物品
 */
public class Consumer implements Runnable {
    private Repository repository;

    public Consumer(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void run() {
        while (true){
            repository.delGoods();

            //1秒消费一个
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

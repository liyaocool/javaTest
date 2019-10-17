package threadTest.test09;

/**
 * 1.供大于求
 * 若生产者大于消费者数量，
 * 则仓库会一只堆积到最大容量。
 *
 * 2.供不应求
 * 若生产者小于消费者数量，
 * 则仓库里只要有一个物品，就会被消费之抢夺消耗掉，仍有一个消费者没有得到物品。
 *
 * 3.供求相等
 * 生产的物品正好够消费者消耗
 */
public class RunTest {
    public static void main(String[] args) {
        Repository repository = new Repository();

        Productor productor = new Productor(repository);

        Consumer consumer = new Consumer(repository);

        Thread p1 = new Thread(productor); //创造第一个生产线程
        Thread p2 = new Thread(productor); //创造第二个生产线程

        Thread c1 = new Thread(consumer); //创造第一个消费者
        Thread c2 = new Thread(consumer); //创造第二个消费者

        p1.start();
        p2.start();

        c1.start();
//        c2.start();
    }
}

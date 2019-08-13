package threadTest.test04;

/**
 * 线程合并join()
 *
 * 在哪里作用域调用,就是把进程合并进该作用域,本使用main作为主线程
 */
public class RunTest03 {
    public static void main(String[] args) throws Exception {
        Processor03 p = new Processor03();
        Thread t1 = new Thread(p);
        t1.setName("t1线程");
        t1.start();

        t1.join(); //这里t1被合并到主线程作用域

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "==>" + i);
        }
    }
}

class Processor03 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + "==>" + i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
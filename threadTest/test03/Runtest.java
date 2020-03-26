package threadTest.test03;

/**
 * sleep是静态方法,和new新对象无关,哪作用域调用,哪里实现
 */
public class Runtest {
    public static void main(String[] args) throws Exception {
        Thread t2 = new Thread(new Process());

        t2.setPriority(5);

        t2.start();

        for (int i = 0; i < 10; i++) {
        // Thread.sleep() 和对象无关,阻塞main主线程,不阻塞t1,阻塞主程序
            Thread.sleep(2000);
            System.out.println("hello main: " + i);
        }

    }
}

class Process implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "===>" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
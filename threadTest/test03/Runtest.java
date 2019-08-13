package threadTest.test03;

/**
 * sleep是静态方法,和new新对象无关,哪作用域调用,哪里实现
 */
public class Runtest {
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new Process());

        Thread t2 = new Thread(new Process());

        t1.setPriority(5);
        t2.setPriority(5);

        t1.start();
        t2.start();

        // Thread.sleep() ==> t1.sleep(),静态方法,和对象无关,阻塞main主线程,不阻塞t1,主程序5秒后输出hello
        t1.sleep(5000);
        System.out.println("hello");

    }
}

class Process implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
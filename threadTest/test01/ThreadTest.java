package threadTest.test01;

/**
 * 多线程编程
 */

public class ThreadTest {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println(main.getName());
        Thread t2 = new Thread(new Process());
        t2.setName("线程2");
        t2.start();
        System.out.println(t2.getName());

    }
}

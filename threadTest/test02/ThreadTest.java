package threadTest.test02;

/**
 * 多线程编程
 */

public class ThreadTest {
    public static void main(String[] args) {
        Thread t = new Thread(new Process());
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main=>" + i);
        }
    }
}

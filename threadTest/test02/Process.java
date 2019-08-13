package threadTest.test02;

public class Process implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("run=>" + i);
        }
    }
}

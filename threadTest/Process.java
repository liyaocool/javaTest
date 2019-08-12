package threadTest;

public class Process implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("run=>" + i);
        }
    }
}

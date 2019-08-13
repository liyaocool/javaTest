package threadTest.test04;

/**
 * 终止线程
 */
public class RunTest02 {
    public static void main(String[] args) throws Exception {

        Processor02 p1 = new Processor02();
        Thread t1 = new Thread(p1);
        t1.start();
        Thread.sleep(3000);
        p1.run = false;
    }
}

class Processor02 implements Runnable {
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (run) {
                try {
                    System.out.println("线程执行==>"+i);
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }else{
                System.out.println("线程结束");
                return;
            }

        }


    }
}

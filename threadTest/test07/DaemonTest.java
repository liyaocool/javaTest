package threadTest.test07;

/*
守护线程
将线程设为守护线程,
则在作用域内其他线程结束,就会终止该守护线程.
 */
public class DaemonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Processor());
        t1.setDaemon(true); //设为守护线程,不设置,则t1里while会一直进行
        t1.start();

        //模拟10秒主线程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "=>>" + i);
            try {
                Thread.sleep(1000);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Processor implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (true) {
            i++;
            System.out.println(Thread.currentThread().getName() + "=>>" + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

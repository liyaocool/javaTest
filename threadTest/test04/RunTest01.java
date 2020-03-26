package threadTest.test04;

/**
 * 使用interrupt()方法抛异常来中断sleep()睡眠
 */
public class RunTest01 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Processor01());
        t1.start();
        Thread.sleep(5000);
        t1.interrupt(); //终断睡眠
    }
}

class Processor01 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("该线程准备睡眠100000000");
            Thread.sleep(100000000);
        } catch (InterruptedException e) {
//            e.printStackTrace();
        }
        System.out.println("线程执行完毕");

    }
}

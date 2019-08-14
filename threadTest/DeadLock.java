package threadTest;

/*
死锁现象,程序永远不会结束
下方注释1,2,3,4解释死锁步骤
 */
public class DeadLock {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        Thread t1 = new Thread(new Processor1(o1, o2)); //t1,t2共享o1,o2对象
        Thread t2 = new Thread(new Processor2(o1, o2));

        t1.start();
        t2.start();
    }
}

class Processor1 implements Runnable {
    private Object o1;
    private Object o2;

    Processor1(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1) {
            System.out.println("Processor1,o1方法");
            try {
                Thread.sleep(1000); //1.这里Processor1,o1方法后,会休眠,立即执行Processor2,o2方法
            } catch (Exception e) {
                e.printStackTrace();
            }
            synchronized (o2) { //3.但共享对象o2锁在Processor2,o2上,拿不到.不会执行,进入等待,准备执行Processor2,o1方法,
                System.out.println("Processor1,o2方法");
            }
        }
    }
}

class Processor2 implements Runnable {
    private Object o1;
    private Object o2;

    Processor2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2) {
            System.out.println("Processor2,o2方法");
            try {
                Thread.sleep(1000); //2.这里Processor2,o2方法后,会休眠,准备执行Processor1,o2方法,
            } catch (Exception e) {
                e.printStackTrace();
            }
            synchronized (o1) { //4.但共享对象o1锁在Processor1,o1上,拿不到.不会执行,进入等待,如此进入死锁,
                System.out.println("Processor2,o1方法");
            }
        }
    }
}

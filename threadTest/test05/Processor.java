package threadTest.test05;

/**
 * 提现的线程
 */
public class Processor implements Runnable {
    private Account act;

    //Constructor
    Processor(Account act) {
        this.act = act;
    }

    @Override
    public void run() {
        act.withdraw(1000.0);

    }
}

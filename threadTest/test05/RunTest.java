package threadTest.test05;

/**
 * 用户账户提现操作,同步进程,单进程修改余额数据
 */
public class RunTest {
    public static void main(String[] args) {
        Account act = new Account("ACT-001",5000);

        Thread t1 = new Thread(new Processor(act));
        Thread t2 = new Thread(new Processor(act));
        t1.start();
        t2.start();
    }
}

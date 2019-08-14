package threadTest.test05;

public class Account {
    private String id;
    private double balance;

    //Constructor
    Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    //setter/getter
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    //体现 (这里是成员方法,不是静态方法,静态方法加synchronized修饰时,是对本类修饰,类只有一个锁)
    public void withdraw(double money) {
        // synchronized 作用域内只能单进程执行,后面()共享对象
        synchronized (this) {
            double after = balance - money;
            //模拟网络延迟一秒
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            //更新余额
            this.setBalance(after);

            //打印
            System.out.println("提现:" + money + ",余额:" + this.getBalance());
        }
    }
}

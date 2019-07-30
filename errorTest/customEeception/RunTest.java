package errorTest.customEeception;
/*
 * 自定义抛出异常*/

public class RunTest {
    public static void main(String[] args) {
        String userName = "jack";
        RegisterService rs = new RegisterService();
        try {
            rs.register(userName);

        } catch (RuleException e) {
            System.out.println(e.getMessage());
        }
    }
}

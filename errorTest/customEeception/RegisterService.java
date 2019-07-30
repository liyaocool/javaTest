package errorTest.customEeception;

public class RegisterService {
    public void register(String name) throws RuleException {
        if (name.length() < 6) {

            throw new RuleException("用户名不少于6位");
        }
        System.out.println("注册成功");

    }
}

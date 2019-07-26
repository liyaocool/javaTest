package interfaceTest.test01;

public class UserService01 implements UserInterface {
    public void login() {
        System.out.println("登录接口01");
    }
    public void logout() {
        System.out.println("退出接口01");
    }
}

package interfaceTest.test01;

public class RunTest {
    public static void main(String[] args) {

        //使用1号服务器接口
        UserInterface user1 = new UserService01();
        user1.login();
        user1.logout();


        //换用2号服务器接口
        UserInterface user2 = new UserService02();
        user2.login();
        user2.logout();
    }
}

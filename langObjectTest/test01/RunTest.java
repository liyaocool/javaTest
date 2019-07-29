package langObjectTest.test01;

public class RunTest {
    public static void main(String[] args) {
        Star s1 = new Star("111","张三");
        Star s2 = new Star("111","张三");
        Star s3 = new Star("112","张三");
        System.out.println(s1.equals(s2));
    }

}

package docoratorTest;

public class MyFileReader implements MyReader {
    public void close() {
        System.out.println("MyFileReader 已经关闭");
    }
}

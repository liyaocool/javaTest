package docoratorTest;

/**
 * 装饰者模式
 * A类，B类相关联，执行B类内的m(),也会执行A类的m(),并可对m1()拓展;
 * 这里，用FileReader,BufferedReader演示，
 * 装饰者要求：
 * 1.装饰者含有被装饰者引用。
 * 2.装饰者和被装饰者应该实现同一个抽象类/接口，来使装饰者和被装饰者解耦，面向抽象类/面向接口 编程
 */
public class RunTest {
    public static void main(String[] args) {
        MyReader reader = new MyFileReader(); //多态，
        MyBufferedReader MyBR = new MyBufferedReader(reader); //多态
        MyBR.close();
    }
}

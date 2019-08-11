package docoratorTest;

public class MyBufferedReader implements MyReader { //装饰者
    private MyReader MyReader; //被装饰者,

    //Constructor
    MyBufferedReader(MyReader MyReader) {
        this.MyReader = MyReader;
    }

    public void a() {
        System.out.println("这是a方法");
    }

    public void close() {
        System.out.println("拓展代码1");
        MyReader.close();
        System.out.println("拓展代码2");
    }
}

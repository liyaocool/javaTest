package arrayTest.stackTest;

public class RunTest {
    public static void main(String[] args) {
        //初始化栈
        Stack s = new Stack();

        //创建元素
        Element e1 = new Element(1);
        Element e2 = new Element(2);
        Element e3 = new Element(3);
        Element e4 = new Element(4);
        Element e5 = new Element(5);

        //压栈操作
        try {
            s.push(e1);
            s.push(e2);
            s.push(e3);
            s.push(e4);
            s.push(e5);
            s.push(e5);
        }catch (StackException e) {
            e.printStackTrace();
        }

        //弹栈操作
        try {
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
            s.pop();
        }catch (StackException e) {
            e.printStackTrace();
        }

    }
}

package arrayTest.stackTest;

/**
 *模拟栈内存,压栈,弹栈
 */

public class Stack {
    Object [] elements;
    int index;

    //Constructor
    Stack(){
        this(5);
    }

    Stack(int max){
        elements = new Object[max];
    }

    //提供压栈方法
    public void push(Object element) throws StackException {
        if (index == elements.length) {
            throw new StackException("抱歉,您的栈已经满了!");
        }
        elements[index++] = element;
        System.out.println("已压栈");
    }

    //提供弹栈方法
    public Object pop() throws StackException {
        if (index == 0) {
            throw new StackException("抱歉,您的栈已空!");
        }
        System.out.println("已弹栈");
        return elements[--index];
    }
}

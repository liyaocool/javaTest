package swingTest;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
public class HelloSwing  extends JFrame{

    private HelloSwing() {
        setTitle("hello swing"); //窗口标题
        setSize(400, 200); //宽高
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭X按钮默认功能,为关闭退出

        JLabel jl = new JLabel("你好,swing"); //创建一个标签
        Container container = getContentPane(); //窗口声明容器
        container.add(jl); //容器内加入标签
        setVisible(true); //显示出来
    }

    public static void main(String[] args) {
        // 显示应用 GUI
        new HelloSwing();
    }
}

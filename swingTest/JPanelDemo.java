package swingTest;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JPanel面板测试程序");
        jf.setBounds(600,300,400,200); //x,y,相对于显示屏横向,和竖向位置
        JPanel jp = new JPanel();
        jp.setBackground(Color.white);
        JLabel jl = new JLabel("放在JPanel面板上JLabel标签");
        jp.add(jl);
        jf.add(jp);
        jf.setVisible(true);
    }
}

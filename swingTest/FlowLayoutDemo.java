package swingTest;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("FlowLayoutDemo");
        JPanel jp = new JPanel();

        JButton btn1 = new JButton("btn1");
        JButton btn2 = new JButton("btn2");
        JButton btn3 = new JButton("btn3");
        JButton btn4 = new JButton("btn4");
        JButton btn5 = new JButton("btn5");
        JButton btn6 = new JButton("btn6");

        jp.add(btn1);
        jp.add(btn2);
        jp.add(btn3);
        jp.add(btn4);
        jp.add(btn5);
        jp.add(btn6);

        jp.setLayout(new FlowLayout(FlowLayout.LEADING,20, 20));
        jp.setBackground(Color.gray);
        jf.add(jp);
        jf.setBounds(300,200,400,200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

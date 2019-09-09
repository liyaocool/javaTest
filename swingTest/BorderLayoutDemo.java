package swingTest;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("BorderLayoutDemo");
        jf.setSize(400, 200);
        JButton btn1 = new JButton("上");
        JButton btn2 = new JButton("左");
        JButton btn3 = new JButton("中");
        JButton btn4 = new JButton("右");
        JButton btn5 = new JButton("下");
        jf.add(btn1, BorderLayout.NORTH);
        jf.add(btn2, BorderLayout.WEST);
        jf.add(btn3, BorderLayout.CENTER);
        jf.add(btn4, BorderLayout.EAST);
        jf.add(btn5, BorderLayout.SOUTH);
        jf.setBounds(300,200,400,200);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

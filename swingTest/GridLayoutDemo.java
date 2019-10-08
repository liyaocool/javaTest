package swingTest;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("GridLayout计算器");
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(4,4,5,5));
        jp.add(new JButton("7"));
        jp.add(new JButton("8"));
        jp.add(new JButton("9"));
        jp.add(new JButton("/"));
        jp.add(new JButton("4"));
        jp.add(new JButton("5"));
        jp.add(new JButton("6"));
        jp.add(new JButton("*"));
        jp.add(new JButton("1"));
        jp.add(new JButton("2"));
        jp.add(new JButton("3"));
        jp.add(new JButton("-"));
        jp.add(new JButton("0"));
        jp.add(new JButton("."));
        jp.add(new JButton("="));
        jp.add(new JButton("+"));

        jf.add(jp);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

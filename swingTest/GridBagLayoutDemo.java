package swingTest;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutDemo {

    public static void makeButton(String title, JFrame jFrame, GridBagLayout gridBagLayout, GridBagConstraints constraints) {
        JButton button = new JButton(title);
        gridBagLayout.setConstraints(button, constraints);
        jFrame.add(button);
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame("网格包布局实验拨号键盘");
        JPanel jp = new JPanel();
        GridBagLayout gridBagLayout = new GridBagLayout();
        jf.setLayout(gridBagLayout);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = 1;
        constraints.weightx = 0.0;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        JTextField tf = new JTextField("086");
        gridBagLayout.setConstraints(tf, constraints);
        jf.add(tf);
        constraints.weightx = 0.5;
        constraints.weighty = 0.2;
        constraints.gridwidth = 1;

        makeButton("7", jf, gridBagLayout, constraints);
        makeButton("8", jf, gridBagLayout, constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeButton("9", jf, gridBagLayout, constraints);
        constraints.gridwidth = 1;

        makeButton("4", jf, gridBagLayout, constraints);
        makeButton("5", jf, gridBagLayout, constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeButton("6", jf, gridBagLayout, constraints);
        constraints.gridwidth = 1;

        makeButton("1", jf, gridBagLayout, constraints);
        makeButton("2", jf, gridBagLayout, constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeButton("3", jf, gridBagLayout, constraints);
        constraints.gridwidth = 1;

        makeButton("←", jf, gridBagLayout, constraints);
        makeButton("0", jf, gridBagLayout, constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeButton("重置", jf, gridBagLayout, constraints);
        constraints.gridwidth = 1;

        constraints.gridwidth = GridBagConstraints.REMAINDER;
        makeButton("拨号", jf, gridBagLayout, constraints);

        jf.setVisible(true);
        jf.setBounds(300, 300, 400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

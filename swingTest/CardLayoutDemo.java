package swingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CardLayoutDemo extends MouseAdapter {
    JPanel p1, p2, p3;
    JLabel l1, l2, l3;
    CardLayout myCard;
    JFrame frame;
    Container contentPane;
    public static void main(String[] args) {
        CardLayoutDemo that = new CardLayoutDemo();
        that.go();
    }

    public void go() {
        frame = new JFrame("Card test");
        contentPane = frame.getContentPane();
        myCard = new CardLayout();
        contentPane.setLayout(myCard);

        l1 = new JLabel("第1个面板的标签");
        l2 = new JLabel("第2个面板的标签");
        l3 = new JLabel("第3个面板的标签");

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        p1.add(l1);
        p2.add(l2);
        p3.add(l3);

        p1.setBackground(Color.blue);
        p2.setBackground(Color.yellow);
        p3.setBackground(Color.white);

        p1.addMouseListener(this);
        p2.addMouseListener(this);
        p3.addMouseListener(this);

        contentPane.add(p1, "卡片1");
        contentPane.add(p2, "卡片2");
        contentPane.add(p3, "卡片3");

        myCard.show(contentPane, "卡片1");

        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mouseClicked(MouseEvent e) {
        myCard.next(contentPane);
    }
}

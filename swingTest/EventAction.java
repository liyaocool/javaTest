package swingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 点击事件监听器
 */
public class EventAction {
    public static void main(String[] args) {

        JFrame frame = new JFrame("事件监听");
        JPanel panel = new JPanel();
        JButton button = new JButton("点击我");
        JLabel label = new JLabel("");
        GridLayout gridLayout = new GridLayout(2, 1, 5, 5);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                {
                    label.setText("按钮被单击了");
                    System.out.println("按钮被单击了");
                }
            }
        });
        frame.add(panel);
        frame.setBounds(600, 300, 400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(gridLayout);
        panel.add(button);
        panel.add(label);



    }

}



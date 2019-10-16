package swingTest;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ListDemo implements ListSelectionListener {
    private JFrame frame;
    private JPanel panel;
    private JList list;
    private JLabel label;

    public static void main(String[] args) {
        ListDemo listDemo = new ListDemo();
        listDemo.go();
    }

    private  void go() {
        frame = new JFrame("列表示例");
        frame.setBounds(600, 600, 300, 300);

        label = new JLabel("");
        String[] items = new String[]{"列表1", "列表2", "列表3"};
        list = new JList<String>(items);
        list.addListSelectionListener(this);
        panel = new JPanel();
        panel.add(list);
        panel.add(label);


        frame.getContentPane().add(panel);
        frame.setVisible(true);

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String text = list.getSelectedValue().toString();
        label.setText("您已经选择了:" + text);
    }
}

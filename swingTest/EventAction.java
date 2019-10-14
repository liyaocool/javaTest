package swingTest;

import javax.swing.*;
import java.awt.event.*;

/**
 * 下拉选择器,输入框,按钮事件
 */
public class EventAction extends WindowAdapter implements ActionListener, ItemListener {

    private JFrame frame = new JFrame("选择您的喜欢的水果");
    private JPanel panel = new JPanel();
    private JComboBox comboBox = new JComboBox(); //下拉选项
    private JTextField textField = new JTextField(12); //输入框
    private JLabel label = new JLabel("请在上方输入");
    private JButton addBtn = new JButton("添加");
    private JButton delBtn = new JButton("删除");

    public static void main(String[] args) {
        EventAction e = new EventAction();
        e.go();
    }

    private void go() {
        frame.add(panel);
        frame.setBounds(600, 300, 600, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.add(comboBox);
        panel.add(textField);
        panel.add(label);
        panel.add(addBtn);
        panel.add(delBtn);

        comboBox.addItemListener(this);
        comboBox.addItem("请选择");
        comboBox.addItem("苹果");

        label.setBounds(120, 50, 100, 40);

        addBtn.addActionListener(this);
        delBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());
        String command = e.getActionCommand();
        if (command.equals("添加")) {
            String input = textField.getText();
            if (input.equals("")) {
                label.setText("不能输入为空");
            } else {
                comboBox.addItem(input);
                label.setText("成功添加:" + input);
            }

        } else if (command.equals("删除")) {
            String select = comboBox.getSelectedItem().toString();
            if (select.equals("请选择")) {
                label.setText("您还没有选择");
            } else {
                comboBox.removeItem(select);
                label.setText("成功删除:" + select);
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String selItem = e.getItem().toString();
        if (selItem.equals("请选择")) {
            label.setText("您还没有选择");
        } else {
            label.setText("您选择了:" + selItem);
        }
    }


}



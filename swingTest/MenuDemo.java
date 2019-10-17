package swingTest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MenuDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("菜单测试");
        frame.setBounds(400, 400, 500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = createMenuBar();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("AAA");
        frame.setJMenuBar(menuBar);
        frame.add(panel);
        frame.setVisible(true);

        panel.add(label);
    }

    private static JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = createFileMenu();
        JMenu editMenu = createEditMenu();
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        return menuBar;
    }

    private static JMenu createFileMenu() {
        JMenu menu = new JMenu("文件");
        menu.setMnemonic(KeyEvent.VK_F);

        JMenuItem item1 = new JMenuItem("新建(N)", KeyEvent.VK_N);
        item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        menu.add(item1);

        menu.addSeparator();

        JMenuItem item2 = new JMenuItem("打开(O)", KeyEvent.VK_O);
        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        menu.add(item2);

        return menu;
    }

    private static JMenu createEditMenu() {
        JMenu menu = new JMenu("编辑");
        JMenuItem menuItem1 = new JMenuItem("删除");
        JMenuItem menuItem2 = new JMenuItem("恢复");
        menu.add(menuItem1);
        menu.add(menuItem2);

        return menu;
    }
}


package bookswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 清除文本框中的文本内容
 * @author 刘恋
 */

public class JTextFieldTest extends JFrame {
    public JTextFieldTest(){
        // 获取窗体容器
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        // 设置文本框初始值
        JTextField jt = new JTextField("aaa");
        // 设置文本框长度
        jt.setColumns(20);
        // 设置字体
        jt.setFont(new Font("宋体",Font.PLAIN,20));
        JButton jb = new JButton("清除");
        // 为文本框添加回车事件
        jt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                // 设置文本框中的值
                jt.setText("触发事件");
            }
        });
        // 为 按钮添加事件
        jb.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                System.out.println(jt.getText());
                jt.setText("");
                jt.requestFocus();

            }
        });
        container.add(jt);
        container.add(jb);
        setBounds(100,100,250,110);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTextFieldTest();
    }
}

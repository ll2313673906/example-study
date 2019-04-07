package bookswing;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * 为标签设置图标
 * @author 刘恋
 */

public class MyImageIcon extends JFrame {
    public MyImageIcon(){
        // 创建容器
        Container container = getContentPane();
        // 创建一个标签
        JLabel jl = new JLabel("这是一个JFrame窗体",JLabel.CENTER);
        // 获取图片所在的url
        URL url = MyImageIcon.class.getResource("/img/1_副本.jpg");
        // 创建Icon对象
        Icon icon = new ImageIcon(url);
        // 为标签设置图片
        jl.setIcon(icon);
        // 设置文字放置在标签中间
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        // 设置标签为不透明状态
        jl.setOpaque(true);
        container.add(jl);
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyImageIcon();
    }
}

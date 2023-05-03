package draw;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: EzioHe
 * @Date: 2023/5/2 15:58
 * @注释: 演示如何在面板上画圆
 */
@SuppressWarnings({"all"})
public class DrawCircle extends JFrame { //JFrame对应窗口,理解成一个画框

    //定义一个面板
    private MyPanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("退出程序");
    }

    public DrawCircle() {
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口(画框)
        this.add(mp);
        //设置画框大小
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true); //可以显示
    }
}

//先定义一个 MyPanel ,继承 JPanel 类

/**
 * @MyPanel: 是一个画板
 * @Graphics g: 理解成画笔
 * @Graphics: 提供了很多的绘图方法
 */
class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) { //绘图方法
        super.paint(g); //调用父类方法，完成初始化
        System.out.println("paint方法被调用");
        //画出一个圆形
        g.drawOval(10, 10, 100, 100);

        //绘制不同的图形
        //画直线
        g.drawLine(10, 10, 100, 100);

        //画矩形边框
        g.drawRect(10, 10, 100, 100);

        //填充矩形,设置画笔颜色
        g.setColor(Color.blue);
        g.fillRect(10, 10, 100, 100);

        //填充椭圆
        g.setColor(Color.red);
        g.fillOval(10, 10, 100, 80);

        //画图片
        //获取图片资源
//        Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/2019249.jpg"));
//        g.drawImage(image,10,10,1920,1080,this);

        //画字符串，先设置颜色和字体
        g.setColor(Color.red);
        g.setFont(new Font("隶书",Font.BOLD,50));
        g.drawString("北京你好",110,110);
    }
}
package tankgame1;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: EzioHe
 * @Date: 2023/5/2 21:09
 * @MyPanel :坦克大战绘图区域
 */
public class MyPanel extends JPanel {
    //定义坦克
    Hero hero = null;

    public MyPanel() {
        hero = new Hero(100, 100); //初始化自己坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750); //填充矩形，默认黑色

        //画出坦克-封装到方法
        drawTank(hero.getX(), hero.getY(), g, 0, 1);
        drawTank(hero.getX()+60, hero.getY(), g, 0, 0);
    }

    //编写方法，画出坦克

    /**
     * @param x:         左上角横坐标
     * @param y:         左上角纵坐标
     * @param g:         画笔
     * @param direction: 坦克方向（上下左右）
     * @param type:      坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direction, int type) {
        //根据不同类型坦克设置不同的颜色
        switch (type) {
            case 0://我们的坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向，来绘制坦克
        switch (direction) {
            case 0: //方向向上
                g.fill3DRect(x, y, 10, 60, false); //画出坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false); //画出坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false); //画出坦克右边的轮子
                g.fillOval(x + 10, y + 20, 20, 20); //画出坦克盖子
                g.drawLine(x + 20, y, x + 20, y + 30); //画出炮筒
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }
}

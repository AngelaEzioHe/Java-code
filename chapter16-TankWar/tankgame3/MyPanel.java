package tankgame3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @Author: EzioHe
 * @Date: 2023/5/2 21:09
 * @MyPanel :坦克大战绘图区域
 */
//为了监听键盘事件，实现 KeyListener
//为了让 Panel 不停的重绘子弹，需将 MyPanel 实现 Runnable当做线程使用
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    Hero hero = null;

    //定义敌人坦克,放入到Vector集合中
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;

    public MyPanel() {
        hero = new Hero(100, 100); //初始化自己坦克
        hero.setSpeed(2);
        for (int i = 0; i < enemyTankSize; i++) {
            //创建一个敌人坦克
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);
            //设置方向
            enemyTank.setDirect(2);
            //启动敌人坦克线程，让它动起来
            new Thread(enemyTank).start();
            //给该EnemyTank 加入一颗子弹
            Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
            //加入到enemyTank的Vector 成员
            enemyTank.shots.add(shot);
            //启动shot对象
            new Thread(shot).start();
            //加入
            enemyTanks.add(enemyTank);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750); //填充矩形，默认黑色

        //画出自己坦克-封装到方法
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);

        //画出敌人坦克.遍历 Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            //从 Vector 取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //判断当前坦克是否存活
            if (enemyTank.isLive) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    Shot shot = enemyTank.shots.get(j);
                    if (shot.isLive) {
                        g.draw3DRect(shot.x, shot.y, 2, 2, false);
                    } else {
                        //从Vector移除
                        enemyTank.shots.remove(shot);
                    }
                }
            }
        }

        //画出Hero射击的子弹
        if (hero.shot != null && hero.shot.isLive == true) {
            //g.fill3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
            g.draw3DRect(hero.shot.x, hero.shot.y, 2, 2, false);
        }
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

        //根据坦克方向，来绘制对应形状的坦克
        //direction 表示方向（1,2,3,4）
        switch (direction) {
            case 0: //方向向上
                g.fill3DRect(x, y, 10, 60, false); //画出坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false); //画出坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false); //画出坦克右边的轮子
                g.fillOval(x + 10, y + 20, 20, 20); //画出坦克盖子
                g.drawLine(x + 20, y, x + 20, y + 30); //画出炮筒
                break;
            case 1: //方向向右
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20);
                break;
            case 2: //方向向下
                g.fill3DRect(x, y, 10, 60, false); //画出坦克左边的轮子
                g.fill3DRect(x + 30, y, 10, 60, false); //画出坦克右边的轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false); //画出坦克右边的轮子
                g.fillOval(x + 10, y + 20, 20, 20); //画出坦克盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60); //画出炮筒
                break;
            case 3: //方向向左
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x, y + 30, 60, 10, false);
                g.fill3DRect(x + 10, y + 10, 40, 20, false);
                g.fillOval(x + 20, y + 10, 20, 20);
                g.drawLine(x + 30, y + 20, x, y + 20);
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    public void hitTank(Shot s, EnemyTank enemyTank) {
        //判断 s 击中坦克
        switch (enemyTank.getDirect()) {
            case 0:
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    enemyTanks.remove(enemyTank);
                }

            case 2: //坦克朝下
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.isLive = false;
                    enemyTank.isLive = false;
                    enemyTanks.remove(enemyTank);
                }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirect(0);
            if (hero.getY() > 0) {
                hero.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            if (hero.getX() + 60 < 1000) {
                hero.moveRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            if (hero.getY() + 60 < 750) {
                hero.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            if (hero.getX() > 0) {
                hero.moveLeft();
            }
        }
        //如果用户按下 J，就需要发射
        if (e.getKeyCode() == KeyEvent.VK_J) {
            hero.shotEnemyTank();
        }
        //让面板重绘
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //判断是否击中敌人坦克
            if (hero.shot != null && hero.shot.isLive) {
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(hero.shot, enemyTank);
                }
            }
            this.repaint();
        }
    }
}
package tankgame3;

import javax.swing.*;

/**
 * @Author: EzioHe
 * @Date: 2023/5/2 21:14
 */
public class TankGame03 extends JFrame {
    //定义 MyPanel
    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame03 tankGame03 = new TankGame03();
    }

    public TankGame03() {
        mp = new MyPanel();
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);
        this.setSize(1200, 950);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
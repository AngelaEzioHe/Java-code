package tankgame2;



import javax.swing.*;

/**
 * @Author: EzioHe
 * @Date: 2023/5/2 21:14
 */
public class TankGame02 extends JFrame {
    //定义 MyPanel
    MyPanel mp = null;

    public static void main(String[] args) {
        TankGame02 tankGame02 = new TankGame02();
    }

    public TankGame02() {
        mp = new MyPanel();
        this.add(mp);
        this.setSize(1000, 750);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
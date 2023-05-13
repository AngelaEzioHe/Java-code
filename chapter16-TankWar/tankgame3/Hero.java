package tankgame3;

import java.util.Vector;

/**
 * @Author: EzioHe
 * @Date: 2023/5/2 21:07
 */
public class Hero extends Tank {
    //定义一个Shot对象，表示一个射击行为
    Shot shot = null;

    //可以发射多颗子弹
    Vector<Shot> shots = new Vector<>();

    public Hero(int x, int y) {
        super(x, y);
    }

    public void shotEnemyTank() {
        if(shots.size()==5){
            return;
        }
        //创建Shot对象，根据当前Hero对象的位置和方向来创建Shot
        switch (getDirect()) {
            case 0:
                shot = new Shot(getX() + 20, getY(), 0);
                break;
            case 1:
                shot = new Shot(getX() + 60, getY() + 20, 1);
                break;
            case 2:
                shot = new Shot(getX() + 20, getY() + 60, 2);
                break;
            case 3:
                shot = new Shot(getX(), getY() + 20, 3);
                break;
            default:
                break;
        }
        shots.add(shot);
        //启动Shot线程
        new Thread(shot).start();
    }
}

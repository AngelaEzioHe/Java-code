package tankgame3;

/**
 * @Author: EzioHe
 * @Date: 2023/5/10 22:29
 * @注释: 射击子弹
 */

public class Shot implements Runnable {
    int x; //x坐标
    int y; //y坐标
    int direct = 0; //子弹方向
    int speed = 4; //子弹速度
    boolean isLive = true; //子弹是否存活

    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() { //射击行为
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //根据方向改变坐标
            switch (direct) {
                case 0: //上
                    y -= speed;
                    break;
                case 1: //右
                    x += speed;
                    break;
                case 2:
                    y += speed;
                    break;
                case 3:
                    x -= speed;
                    break;
                default:
                    break;
            }
            //测试，输出x,y坐标
            System.out.println("子弹 x=" + x + " 子弹y=" + y);
            //如果子弹移动到面板边界，或者碰到敌人坦克时，就应该销毁(销毁线程)
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)) {
                System.out.println("子弹线程退出");
                isLive = false;
                break;
            }
        }

    }
}
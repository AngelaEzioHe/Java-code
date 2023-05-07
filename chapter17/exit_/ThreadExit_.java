package exit_;

/**
 * @Author: EzioHe
 * @Date: 2023/5/7 19:17
 */
public class ThreadExit_ {
    public static void main(String[] args) throws InterruptedException {
        T t1 = new T();
        t1.start();

        //希望主线程可以修改 t1 线程终止,必须可以修改 loop
        System.out.println("主线程休息10秒");
        Thread.sleep(10*1000); //t1持续运行，主线程10秒后停止
        t1.setLoop(false);
        System.out.println("10秒到了");
    }
}

class T extends Thread {
    private int count = 0;
    //设置一个控制变量
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程 T 运行中...");
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
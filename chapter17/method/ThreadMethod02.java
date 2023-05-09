package method;

/**
 * @Author: EzioHe
 * @Date: 2023/5/7 20:10
 */
public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {
        T2 t2 = new T2();
        t2.start();
        for (int i = 1; i <=20 ; i++) {
            Thread.sleep(1000);
            System.out.println("主线程吃了"+i+"个包子");
            t2.join();
        }
    }
}

class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.yield();
            System.out.println("子线程吃了" + i+"个包子");
        }
    }
}
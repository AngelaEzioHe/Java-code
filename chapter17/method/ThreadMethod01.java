package method;

/**
 * @Author: EzioHe
 * @Date: 2023/5/7 19:47
 */
public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        T t1 = new T();
        t1.setName("小龙");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi" + i);
        }
        System.out.println(t1.getName() + " 线程优先级=" + t1.getPriority());
        t1.interrupt(); //中断 t1 线程的休眠
    }
}
class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " 吃包子" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中~~~");
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "被 interrupt 了");
            }
        }
    }
}
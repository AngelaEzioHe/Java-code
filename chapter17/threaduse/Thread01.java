package threaduse;

/**
 * @Author: EzioHe
 * @Date: 2023/5/4 21:02
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start(); //启动线程

        //主线程和子线程交替执行
        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程 i=" + i);
            Thread.sleep(1000);
        }
    }
}

class Cat extends Thread {
    int times = 0;

    @Override
    public void run() { //重写 run 方法，实现自己的业务逻辑
        while (true) {
            System.out.println("喵喵我是咪咪" + (++times) + " 线程名称" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 80) {
                break;
            }
        }
    }
}
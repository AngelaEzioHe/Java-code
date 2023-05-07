package ticket;

/**
 * @Author: EzioHe
 * @Date: 2023/5/7 17:57
 * @注释: 使用多线程，模拟三个窗口同时售票100张
 */
public class SellTicket {
    public static void main(String[] args) {
        //用继承类的方式
        {
            SellTicket01 sellTicket01 = new SellTicket01();
            SellTicket01 sellTicket02 = new SellTicket01();
            SellTicket01 sellTicket03 = new SellTicket01();

            sellTicket01.start();
            sellTicket02.start();
            sellTicket03.start();
        }

        //用接口的方式
        {
            SellTicket02 sellTicket04 = new SellTicket02();
            new Thread(sellTicket04).start();
            new Thread(sellTicket04).start();
            new Thread(sellTicket04).start();
        }
    }
}

class SellTicket01 extends Thread {
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票,剩余票数=" + (--ticketNum));
        }
    }
}

class SellTicket02 implements Runnable{
    private int ticketNum = 100;
    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束...");
                break;
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票,剩余票数=" + (--ticketNum));
        }
    }
}
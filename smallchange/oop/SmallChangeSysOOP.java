package smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    OOP完成各个功能：
    1.先完成显示菜单，并可以选择
    2.完成零钱通明细
    3.完成收益入账
    4.消费
    5.退出
 */
public class SmallChangeSysOOP {
    boolean loop = true; //让 do-while 持续循环，直到退出
    String key; //选项
    String details = "-------------零钱通明细-------------";
    double money; //出入账
    double balance = 0; //余额
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //日期形式格式化
    Scanner scanner = new Scanner(System.in);
    String note; //消费的说明

    public void mainMenu() {
        do {
            System.out.println("\n=============OOP零钱通菜单=============");

            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退出");

            System.out.print("请选择（1-4）");
            key = scanner.next();

            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.inCome();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("菜单选择有误，请重新选择");
            }
        } while (loop);
    }

    public void detail() {
        System.out.println(details);
    }

    public void inCome() {
        System.out.println("收益入账金额：");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("收益入账金额范围需要大于0");
            return;
        }
        balance += money;
        date = new Date(); //获取当前日期
        System.out.println(sdf.format(date));
        details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
        return;
    }

    public void pay() {
        System.out.println("消费金额：");
        money = scanner.nextDouble();
        // money 值应校验（找出不正确的金额，给出提示，直接退出）
        if (money <= 0 || money > balance) {
            System.out.println("消费金额应该在 0-" + balance);
            return;
        }
        System.out.println("请输入消费说明");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
        return;
    }

    public void exit() {
        String choice;
        while (true) { //必须输入 y/n 否则一直循环
            System.out.println("你确定退出吗？ y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if (choice.equals("y")) {
            loop = false;
        }
    }
}

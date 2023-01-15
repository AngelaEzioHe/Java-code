package smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true; //让 do-while 持续循环，直到退出
        String key; //选项
        String details = "-------------零钱通明细-------------";
        double money; //出入账
        double balance = 0; //余额
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //日期形式格式化
        Scanner scanner = new Scanner(System.in);
        String note; //消费的说明
        do {
            System.out.println("\n=============零钱通菜单=============");

            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退出");

            System.out.print("请选择（1-4）");
            key = scanner.next();

            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额：");
                    money = scanner.nextDouble();
                    if (money <= 0) {
                        System.out.println("收益入账金额范围需要大于0");
                        break;
                    }
                    balance += money;
                    date = new Date(); //获取当前日期
                    System.out.println(sdf.format(date));
                    details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
                    break;
                case "3":
                    System.out.println("消费金额：");
                    money = scanner.nextDouble();
                    // money 值应校验（找出不正确的金额，给出提示，直接退出）
                    if (money <= 0 || money > balance) {
                        System.out.println("消费金额应该在 0-" + balance);
                        break;
                    }
                    System.out.println("请输入消费说明");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + "余额:" + balance;
                    break;
                case "4":
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
                    break;
                default:
                    System.out.println("菜单选择有误，请重新选择");
            }
        } while (loop);

        System.out.println("-------退出了零钱通-------");
    }
}

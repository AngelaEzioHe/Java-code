package exception_;

import java.util.Scanner;

/**
 * @Author: EzioHe
 * @Date: 2023/4/13 0:41
 */
public class TryCatchExercise04 {
    public static void main(String[] args) {
        //如果用户输入的不是一个整数，就提示他反复输入，直到输入一个整数为止
        /*
            1.创建Scanner对象
            2.无限循环，接收输入
            3.值转换成一个 int
            4,。如果在装换时抛出异常，说明输入的不是一个可以装换成int的内容
            5.如果没有抛出异常，则 break 该循环
         */
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while (true) {
            System.out.println("输入一个整数：");
            inputStr = scanner.next();
            try {
                num = Integer.parseInt(inputStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数:");
            }
        }
        System.out.println("你输入的数是" + num);
    }
}

package wrapper;

/**
 * @Author: EzioHe
 * @Date: 2023/4/14 0:45
 */
public class Integer01 {
    public static void main(String[] args) {
        int n1 = 100;

        //手动装箱
        //int -> Integer
        Integer integer1 = Integer.valueOf(n1);

        //手动开箱
        //Integer -> int
        int i = integer1.intValue();

        //jdk5后，就可以自动装箱和拆箱
        int n2 = 200;
        Integer integer2 = n2;
        int n3 = integer2;
    }
}
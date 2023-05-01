package junit_;

import org.junit.jupiter.api.Test;

/**
 * @Author: EzioHe
 * @Date: 2023/5/1 19:32
 */
public class Junit {
    public static void main(String[] args) {
        //传统方法
//        new Junit().m1();
//        new Junit().m2();
    }

    @Test
    public void m1() {
        System.out.println("m1方法被调用");
    }

    @Test
    public void m2() {
        System.out.println("m2方法被调用");
    }
}

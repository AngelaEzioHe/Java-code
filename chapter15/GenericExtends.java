import java.util.ArrayList;
import java.util.List;

/**
 * @Author: EzioHe
 * @Date: 2023/5/1 19:12
 */
public class GenericExtends {
    public static void main(String[] args) {
        String o = new String("xx");

        //举例说明三个方法的使用
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<AA>     list3 = new ArrayList<>();
        ArrayList<BB>     list4 = new ArrayList<>();
        ArrayList<CC>     list5 = new ArrayList<>();

        //如果是 List<?> c 可以接收任意的泛型类型
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //List<? extends AA> c 表示上限，可以接收AA或AA的子类
//        printCollection2(list1); //×
//        printCollection2(list2); //×
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);

        //List<? super AA> c 表示支持AA类以及AA的父类，不限于直接父类
        printCollection3(list1);
//        printCollection3(list2); //×
        printCollection3(list3);
//        printCollection3(list4); //×
//        printCollection3(list5); //×
    }

    //几个方法
    public static void printCollection1(List<?> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }

    //? extends AA 表示上限，可以接收AA或AA的子类
    public static void printCollection2(List<? extends AA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }

    //? super AA 表示支持AA类以及AA的父类，不限于直接父类
    public static void printCollection3(List<? super AA> c) {
        for (Object object : c) {
            System.out.println(object);
        }
    }
}

class AA {
}

class BB extends AA {
}

class CC extends BB {
}
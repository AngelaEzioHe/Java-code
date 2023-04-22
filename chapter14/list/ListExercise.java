package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: EzioHe
 * @Date: 2023/4/22 17:18
 */
public class ListExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }
        System.out.println("list=" + list);
        list.add(1, "初生小龙");
        System.out.println("list=" + list);

        //获得第五个元素
        System.out.println("四五个元素=" + list.get(4));

        //删除第六个元素
        list.remove(5);
        System.out.println("list=" + list);

        //修改第七个元素
        list.set(6, "小龙疯狂掉星");
        System.out.println("list=" + list);

        //使用迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
    }
}

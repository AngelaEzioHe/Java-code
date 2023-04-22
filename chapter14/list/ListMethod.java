package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: EzioHe
 * @Date: 2023/4/19 16:49
 */
public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");

        //在 index=1 的位置插入一个对象
        list.add(1,"小龙");
        System.out.println("list="+list);

        //从 index 位置开始，将 list2 中所有元素添加进来
        List list2=new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1,list2);
        System.out.println("list2="+list2);
        System.out.println("list="+list);

    }
}

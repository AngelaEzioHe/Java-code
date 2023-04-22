package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: EzioHe
 * @Date: 2023/4/19 0:35
 */
public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list=new ArrayList();
        //添加单个元素
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("list="+list);

        //删除指定元素
        list.remove(0); //删除第一个元素
        System.out.println("list="+list);
        list.remove(true);
        System.out.println("list="+list);

        //查找元素是否存在
        System.out.println(list.contains("jack"));

        //获取元素个数
        System.out.println(list.size());

        //判断是否为空
        System.out.println(list.isEmpty());

        //清空
        list.clear();
        System.out.println("list="+list);

        //添加多个元素
        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        list.addAll(list2);
        System.out.println("list="+list);

        //判断多个元素是否存在
        System.out.println(list.containsAll(list2));

        //删除多个元素
        list.add("聊斋");
        list.removeAll(list2);
        System.out.println("list="+list);
    }
}

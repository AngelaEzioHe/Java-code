package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: EzioHe
 * @Date: 2023/4/22 17:40
 */
@SuppressWarnings({"all"})
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦","曹雪芹",100));
        list.add(new Book("西游记","吴承恩",10));
        list.add(new Book("水浒传","施耐庵",9));
        list.add(new Book("三国","罗贯中",80));
        //list.add(new Book("西游记","吴承恩",50));

        for (Object o :list) {
            System.out.println(o);
        }

        sort(list);
        System.out.println("==排序后==");
        for (Object o :list) {
            System.out.println(o);
        }
    }

    public static void sort(List list){
        int listSize=list.size();
        for(int i=0;i<listSize-1;i++){
            for(int j=0;j<listSize-1-i;j++){
                Book book1=(Book)list.get(j);
                Book book2=(Book)list.get(j+1);
                if(book1.getPrice()>book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
}

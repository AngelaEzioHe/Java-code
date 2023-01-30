package annotation_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 何蛋
 * @version 1.0
 */
public class SuppressWarnings_ {
    @SuppressWarnings({"rawtypes","unchecked","unused"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        int i;
        System.out.println(list.get(1));
    }
}

package date_;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: EzioHe
 * @Date: 2023/4/17 0:45
 */
public class Date01 {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format= sdf.format(date1);
        System.out.println(format);
    }
}

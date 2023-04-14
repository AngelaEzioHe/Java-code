package wrapper;

/**
 * @Author: EzioHe
 * @Date: 2023/4/14 22:34
 */
public class WrapperVSString {
    public static void main(String[] args) {
        //包装类 (Integer)->String
        Integer i = 100; //自动装箱
        //方式一
        String str1 = i + "";
        //方式二
        String str2 = i.toString();
        //方式三
        String str3 = String.valueOf(i);

        //String->(Integer)
        String str4 = "12345";
        Integer i2 = Integer.parseInt(str4);

        //Integer i3 = new Integer(str4);
    }
}

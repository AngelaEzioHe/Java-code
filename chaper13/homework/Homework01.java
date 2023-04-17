package homework;

/**
 * @Author: EzioHe
 * @Date: 2023/4/17 23:32
 */
public class Homework01 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println("交换前：" + str);
        str = reverse(str, 1, 4);
        System.out.println("交换后：" + str);
    }

    /**
     * 将 str 中指定部分进行翻转
     */
    public static String reverse(String str, int start, int end) {
        if (!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}

package enum_;

/**
 * @author 何蛋
 * @version 1.0
 * 演示Enum类各种方法的使用
 */
public class EnumMethod {
    public static void main(String[] args) {
        Season02 autumn = Season02.AUTUMN;

        System.out.println(autumn.name());

        System.out.println(autumn.ordinal()); //输出枚举对象的次序（从0开始）

        Season02[] values = Season02.values();
        for (Season02 season : values) {
            System.out.println(season);
        }
    }
}

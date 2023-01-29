package enum_;

/**
 * @author 何蛋
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season02.SPRING);
    }
}

enum Season02 {
    /*
        public final static Season02 SPRING = new Season02("春天", "温暖");
        public final static Season02 WINTER = new Season02("冬天", "寒冷");
        public final static Season02 SUMMER = new Season02("夏天", "炎热");
        public final static Season02 AUTUMN = new Season02("秋天", "凉爽");
     */

    /*
        使用 enum 代替 class
            public final static Season02 SPRING = new Season02("春天", "温暖")
            改为
            SPRING("春天", "温暖");
     */

    SPRING("春天", "温暖"),
    WINTER("冬天", "寒冷"),
    SUMMER("夏天", "炎热"),
    AUTUMN("秋天", "凉爽");

    private String name;
    private String desc; //描述

    private Season02(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season02{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
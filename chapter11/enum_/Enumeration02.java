package enum_;

/**
 * @author 何蛋
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season01.SPRING);
        System.out.println(Season01.SUMMER);
        System.out.println(Season01.AUTUMN);
        System.out.println(Season01.WINTER);
    }
}

/*
    1.将构造器私有化，防止直接 new
    2.去掉 setter 方法，防止属性被修改
    3.在 newSeason 内部，直接创建固定的对象
 */
class Season01 {
    private String name;
    private String desc; //描述

    public final static Season01 SPRING = new Season01("春天", "温暖");
    public final static Season01 WINTER = new Season01("冬天", "寒冷");
    public final static Season01 SUMMER = new Season01("夏天", "炎热");
    public final static Season01 AUTUMN = new Season01("秋天", "凉爽");

    private Season01(String name, String desc) {
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
        return "newSeason{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
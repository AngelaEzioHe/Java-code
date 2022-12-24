public class Object01 {
    public static void main(String[] args) {
        /*
            1.new Cat() 创建一只猫
            2.Cat cat1=new Cat(); 把创建的猫赋值给 cat1
            3.cat1就是一个对象
         */
        Cat cat1=new Cat();
        cat1.name="小白";
        cat1.age=3;
        cat1.color="白色";
        Cat cat2=new Cat();
        cat2.name="小花";
        cat2.age=3;
        cat2.color="花色";
    }
}

class Cat{
    String name;
    int age;
    String color;
}
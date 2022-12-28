public class Homework7 {
    public static void main(String[] args) {
        Dog dog=new Dog("大黄","黄色",4);
        dog.show();
    }
}
class Dog{
    String name;
    String color;
    int age;
    public Dog(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;
    }
    public void show(){
        System.out.println("名字="+name);
        System.out.println("颜色="+color);
        System.out.println("年龄="+age);
    }
}
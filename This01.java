public class This01 {
    public static void main(String[] args) {
        dog dog1=new dog("大壮",3);
        System.out.println("dog1的hashcode="+dog1.hashCode());
        dog1.info();
//        dog dog2=new dog("大黄",2);
//        System.out.println("dog2的hashcode="+dog2.hashCode());
    }
}
class dog{
    String name;
    int age;
    public dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void info(){
        System.out.println("this.hashcode="+this.hashCode());
        System.out.println(name+"\t"+age+"\t");
    }
}
public class TestPerson {
    public static void main(String[] args) {
        PersonP p1=new PersonP("mary",20);
        PersonP p2=new PersonP("mary",30);
        System.out.println("p1与p2比较的结果="+p1.compareTo(p2));
    }
}
class PersonP{
    String name;
    int age;
    public PersonP(String name,int age){
        this.age=age;
        this.name=name;
    }
    public boolean compareTo(PersonP p){
        return this.name.equals(p.name) && this.age==p.age;
    }
}
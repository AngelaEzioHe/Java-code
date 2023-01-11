package hyfstu.extend_.improve_;

//Pupil和Graduate的父类
public class Student {
    //共有属性
    public String name;
    public int age;
    private double score;

    //公有方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("大学生名 " + name + " 年龄=" + age + " 成绩=" + score);
    }
}

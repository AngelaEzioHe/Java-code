package hyfstu.extend_.improve_;

import hyfstu.extend_.Graduate;
import hyfstu.extend_.Pupil;

public class Test {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 10;
        pupil.testing();
        pupil.setScore(60);
        pupil.showInfo();

        System.out.println("==================================");

        hyfstu.extend_.Graduate graduate = new Graduate();
        graduate.name = "金角大王";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(100);
        graduate.showInfo();
    }
}

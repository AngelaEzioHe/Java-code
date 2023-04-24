package generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @Author: EzioHe
 * @Date: 2023/4/23 23:12
 */
@SuppressWarnings({"all"})
public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jack", 20000, new MyDate(2000, 11, 11)));
        employees.add(new Employee("jack", 12000, new MyDate(2001, 12, 12)));
        employees.add(new Employee("hyf", 5000, new MyDate(2003, 10, 10)));
        System.out.println("employees=" + employees);

        System.out.println("===对雇员进行排序===");
        //先按 name 排序，如果 name 相同，则按生日日期的先后排序。
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                //先对传入的参数进行验证
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)) {
                    System.out.println("类型不正确~~~");
                    return 0;
                }
                //比较名字
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0) {
                    return i;
                }

                //下面是对 birthday 的比较，因此，我们最好把这个比较放在 MyDate 类里完成
                /*
                    //如果 name 相同，就比较 birthday-year
                    int yearMinus = emp1.getBirthday().getYear() - emp2.getBirthday().getYear();
                    if (yearMinus != 0) {
                        return yearMinus;
                    }
                    //如果 year 相同，就比较 month
                    int monthMinus = emp1.getBirthday().getYear() - emp2.getBirthday().getYear();
                    if (monthMinus != 0) {
                        return monthMinus;
                    }
                    //如果 month 相同，就比较 day
                    return emp1.getBirthday().getDay() - emp2.getBirthday().getDay();
                 */
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        });
        System.out.println("===排序后结果输出");
        System.out.println("employees" + employees);
    }
}

class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) { //把对 year-month-day 的比较放在这里
        //如果 name 相同，就比较 birthday-year
        int yearMinus = year - o.getYear();
        if (yearMinus != 0) {
            return yearMinus;
        }
        //如果 year 相同，就比较 month
        int monthMinus = month - o.getYear();
        if (monthMinus != 0) {
            return monthMinus;
        }
        //如果 month 相同，就比较 day
        return day - o.getDay();
    }
}

class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
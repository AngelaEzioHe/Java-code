package hyfstu.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("Tom", 2500);
        Manager miLan = new Manager("MiLan", 5000, 200000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(miLan);
        polyParameter.testWork(tom);
        polyParameter.testWork(miLan);

    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        } else if (e instanceof Manager) {
            ((Manager) e).manage();
        }else {
            System.out.println("不做处理...");
        }
    }
}

package hyfstu.interface_;

public class Interface03 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
    }
    public static void t(DBIinterface db){
        db.connect();
        db.close();
    }
}

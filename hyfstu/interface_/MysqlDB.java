package hyfstu.interface_;

public class MysqlDB implements DBIinterface {
    @Override
    public void connect() {
        System.out.println("连接MySQL...");
    }

    @Override
    public void close() {
        System.out.println("关闭MySQL...");
    }
}

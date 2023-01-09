package hyfstu.encap;

public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("jack");
        account.setBalance(60);
        account.setPwd("123456");
        account.showInfo();

        Account account1 = new Account("marry", 10, "1234567");
        account1.showInfo();
    }
}

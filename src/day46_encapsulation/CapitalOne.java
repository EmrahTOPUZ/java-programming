package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {

        CheckingAccount account = new CheckingAccount();
        account.setAccountNumber(1234567);
        account.setAccountHolder("Emrah Topuz");
        account.setType("360 Checking");
        account.setBalance(230.00);

        System.out.println(account);
    }
}

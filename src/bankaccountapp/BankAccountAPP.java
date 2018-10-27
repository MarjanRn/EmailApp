package bankaccountapp;

public class BankAccountAPP {
    public static void main(String[] args) {
        Checkings checkings = new Checkings("Marjan", "123456789", 1200);
        Savings savings = new Savings("Joe", "154678965", 2000);

        savings.showInfo();
        checkings.showInfo();

        savings.deposit(5500);
        savings.transfer("checking",200);
        savings.withdraw(125);

        savings.compound();

    }
}

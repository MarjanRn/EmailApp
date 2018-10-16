package bankaccountapp;

public class Savings extends Account{
    public Savings(String name, String sSN, int balance){
        super(name, sSN, balance);
        accountNumber = "1" + accountNumber;
    }
}

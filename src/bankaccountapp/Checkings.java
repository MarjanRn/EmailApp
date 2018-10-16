package bankaccountapp;

public class Checkings extends Account{
    public  Checkings(String name, String sSN, int balance){
        super(name, sSN, balance);
        accountNumber = "2" + accountNumber;

    }
}

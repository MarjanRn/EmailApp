package bankaccountapp;

public class Savings extends Account{
    int safetyDepositBoxId;
    int safetyDepositBoxKey;

    public Savings(String name, String sSN, int balance){
        super(name, sSN, balance);
        accountNumber = "1" + accountNumber;
    }

    protected void showInfo(){
        super.showInfo();
        System.out.println("Account Type: Saving");
    }
}

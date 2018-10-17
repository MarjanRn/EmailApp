package bankaccountapp;

public class Savings extends Account{
    int safetyDepositBoxId;
    int safetyDepositBoxKey;

    public Savings(String name, String sSN, int balance){
        super(name, sSN, balance);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    protected void showInfo(){
        super.showInfo();
        System.out.println("Account Type: Saving" +
                "\n" + safetyDepositBoxId +
                "\n" + safetyDepositBoxKey);
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxId = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
    }
}

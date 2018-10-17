package bankaccountapp;

public class Savings extends Account{
    int safetyDepositBoxId;
    int safetyDepositBoxKey;

    public Savings(String name, String sSN, int balance){
        super(name, sSN, balance);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate(){
        System.out.println("Saving Rate");
        rate = getBaseRate() - .25;
    }

    protected void showInfo(){
        super.showInfo();
        System.out.println("Account Type: Saving" +
                "\n" + safetyDepositBoxId +
                "\n" + safetyDepositBoxKey +
                "\n" + rate);
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxId = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
    }
}

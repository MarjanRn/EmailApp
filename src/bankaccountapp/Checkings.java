package bankaccountapp;

public class Checkings extends Account{

    int debitCardNumber;
    int debitCardPIN;

    public  Checkings(String name, String sSN, int balance){
        super(name, sSN, balance);
        accountNumber = "2" + accountNumber;
    }

    protected void showInfo(){
        super.showInfo();
        System.out.println("Account Type: Saving");
    }
}

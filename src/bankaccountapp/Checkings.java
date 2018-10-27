package bankaccountapp;

public class Checkings extends Account{

    int debitCardNumber;
    int debitCardPIN;

    public  Checkings(String name, String sSN, int balance){
        super(name, sSN, balance);
        accountNumber = "2" + accountNumber;
        setdebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    private void setdebitCard() {
        debitCardNumber = (int) (Math.random()* Math.pow(10,12));
        debitCardPIN = (int) (Math.random()* Math.pow(10,4));
    }

    protected void showInfo(){
        super.showInfo();
        System.out.println("Account Type: Saving" +
                "\n" + debitCardPIN +
                "\n" + debitCardNumber +
                "\n" + rate);
    }
}

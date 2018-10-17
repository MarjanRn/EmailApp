package bankaccountapp;

public abstract class Account implements IBaseRate{

    String name;
    String sSN;
    String accountNumber;
    int balance;
    static int index = 10000;
    double rate;

    public Account(String name, String sSN, int balance){
        this.name = name;
        this.sSN = sSN;
        this.balance = balance;
        index++;
        this.accountNumber = generateAccountNumber();

        setRate();

    }

    public abstract void setRate();

    private String generateAccountNumber(){
        String lastTwoDigits = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10,3));
        return lastTwoDigits + uniqueID + randomNumber;
    }

    protected void showInfo(){
        System.out.println("\nNAME:  "+ name + "\nBalance" + "  $" + balance);
        System.out.println("Account#: " + this.accountNumber );
    }
}

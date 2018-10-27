package bankaccountapp;

public abstract class Account implements IBaseRate{

    String name;
    String sSN;
    String accountNumber;
    double balance;
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

    public void compound(){
        double accInterest = balance * (rate/100);
        balance = balance + accInterest;
        System.out.println("Account Interest: " + accInterest );
        printBalance();
    }

    public void deposit(double amount) {
        balance = balance + amount;
        printBalance();
    }

    public void withdraw(double amount){
        balance = balance - amount;
        printBalance();
    }

    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Balance : " + balance);
    }

    protected void showInfo(){
        System.out.println("\nNAME:  "+ name + "\nBalance" + "  $" + balance);
        System.out.println("Account#: " + this.accountNumber );
    }
}

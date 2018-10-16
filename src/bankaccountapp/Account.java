package bankaccountapp;

public abstract class Account implements IBaseRate{

    String name;
    String sSN;
    String accountNumber;
    int balance;
    static int index = 10000;

    public Account(String name, String sSN, int balance){
        this.name = name;
        this.sSN = sSN;
        this.balance = balance;
        System.out.println("NAME :  "+ name + "  " + sSN + "  $" + balance);
        index++;
        this.accountNumber = generateAccountNumber();
        System.out.println("Account#: " + this.accountNumber);
    }

    private String generateAccountNumber(){
        String lastTwoDigits = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int)(Math.random() * Math.pow(10,3));
        return lastTwoDigits + uniqueID + randomNumber;
    }
}

package EmailAPP;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args){
        Email email = new Email();
        System.out.println("Enter First Name: ");
        Scanner inFirstNAme = new Scanner(System.in);
        email.setFirstName(inFirstNAme.nextLine().toString());
        System.out.println("Enter Last Name: ");
        Scanner inLastName = new Scanner(System.in);
        email.setLastName(inLastName.nextLine().toString());
        System.out.println(email.showInfo());
    }
}

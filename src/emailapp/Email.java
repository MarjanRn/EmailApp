package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String company;
    private String generatedEmail;
    private String alternateEmail;
    private int mailboxCapacity = 500;
    private static final String SEPARATOR = ".";
    private static final String AT = "@";
    private static final String HOST = ".com";
    private static final int defaultPassLength = 8;


    Email(){
        this.firstName = setFirstName();
        this.lastName = setLastName();
        this.department = setDepartment();
        this.company = setCompanyName();
        this.password = generatePassword(defaultPassLength);

    }


    public String getPassword(){
        return this.password;
    }

    public String getGeneratedEmail(){
        return this.generatedEmail;
    }

    public String setFirstName() {
        System.out.println("Enter First Name: ");
        Scanner inFirstNAme = new Scanner(System.in);
        return inFirstNAme.nextLine().toString();
    }

    public String setLastName() {
        System.out.println("Enter Last Name: ");
        Scanner inLastName = new Scanner(System.in);
        return inLastName.nextLine().toString();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getCompany() {
        return company;
    }

    private String setDepartment(){
        System.out.print("Enter the department \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none:\n");
        Scanner in = new Scanner(System.in);
        int department = in.nextInt();
        switch (department){
            case 1:
                return "sales";
            case 2:
                return "development";
            case 3:
                return "accounting";
            default:
                return "";
        }
    }

    //generate email address
    public String generateEmail(){
        this.generatedEmail = firstName.toLowerCase() + SEPARATOR + lastName.toLowerCase() + AT + department + SEPARATOR + company + HOST;
        return this.generatedEmail;
    }

    //Generate a random password
    String generatePassword(int passLength){
        String possibleChars = "ABCDEFGHIJKLMONPQRSTUVWXYZ1234567890@#$%&";
        char[] randomPass = new char[passLength];
        for (int i = 0 ; i < passLength ; i++){
            int randomCharInd = (int) (Math.random() * possibleChars.length());
            randomPass[i] = possibleChars.charAt(randomCharInd);
        }
        return randomPass.toString();
    }

    String setCompanyName(){
        System.out.println("Enter the company name: ");
        Scanner in = new Scanner(System.in);
        return in.nextLine().toString();
    }

    public String showInfo(){
        return firstName + " " + lastName + "\n" + generateEmail()
                + "\n" + password;
    }


    //Set the alternate email
    public void alternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }

    //Change the password
    public void changePassword(String password){
        this.password = password;
    }
}

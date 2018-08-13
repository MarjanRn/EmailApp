package EmailAPP;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String department;
    private String company;
    private String generatedEmail;
    private String alternateEmail;
    int mailboxCapacity = 500;
    public static final String SEPARATOR = ".";
    public static final String AT = "@";
    public static final String HOST = ".com";
    public static final int defaultPassLength = 8;

    //Constructor to receive the first name and last name
   public Email(){
        this.department = setDepartment();
        this.company = setCompanyName();
        this.password = generatePassword(defaultPassLength);

    }



    //Set the mail capacity
    public void setMailboxCapacity(int mailboxCapacity){
        this.mailboxCapacity = mailboxCapacity;
    }


    //Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public String getGeneratedEmail(){
        return this.generatedEmail;
    }


    //generate email address
    public String generateEmail(){
        this.generatedEmail = firstName.toLowerCase() + SEPARATOR + lastName.toLowerCase() + AT + department + SEPARATOR + company + HOST;
        return this.generatedEmail;
    }


    public String showInfo(){
        return firstName + " " + lastName + "\n" + generatedEmail
                + "\n" + password;
    }

    //Ask for the department
    private String setDepartment(){
        System.out.print("Enter the department \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none:");
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

    //Set the alternate email
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }
}

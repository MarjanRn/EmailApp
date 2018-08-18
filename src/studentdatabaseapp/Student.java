package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String studentID;
    private int gradeYear;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;


    //Constructor: prompt user to enter student's name and year
    public Student(){
        System.out.println("Please enter the student's first name: ");
        Scanner firstNameIn = new Scanner(System.in);
        this.firstName = firstNameIn.nextLine();

        System.out.println("Please enter the student's last name: ");
        Scanner lastNameIn = new Scanner(System.in);
        this.lastName = lastNameIn.nextLine();

        System.out.println("Please enter the student's level: " +
                "\n1 for First Year \n2 for Second Year \n3 for Third Year \n4 for Last Year");
        Scanner levelIn = new Scanner(System.in);
        this.gradeYear = levelIn.nextInt();

        generateStudentID(gradeYear);
    }

    //Generate an unique student ID
    private void generateStudentID(int gradeYear){
        this.studentID = gradeYear + "" + id++;
    }

    //Enroll in courses
    public void courseEnrolement(){

        do {
            System.out.println("Enter the course name to enrol(Q to exit)");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses =  courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        }while (1 == 1);

    }

    //View balance
    public void viewBalance(){
        System.out.println("Your balance is: " + tuitionBalance);
    }

    //Pay tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Enter your payment amount: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }


    //Show student's status
    public void showStudentsStatus(){

        System.out.println(studentID + firstName + lastName + gradeYear + courses + tuitionBalance );
    }


}

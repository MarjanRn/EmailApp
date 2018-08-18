package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //Ask how many students you want to add
        System.out.println("Enter number of students to enrol:");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];




        //Create n number of new students


        Student student = new Student();
        student.courseEnrolement();
        student.payTuition();
        student.showStudentsStatus();
    }
}

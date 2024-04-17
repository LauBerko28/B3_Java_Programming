package day09_a_scanner;
/*
    Task

    create Scanner object
    ask the user to enter their first name - next
    ask the user to enter their last name - next
    ask the user if they are employed - boolean
    ask the user if they are a student - boolean

 */
import java.util.Scanner;

public class WorkStatus {
    public static void main (String [] args ){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.next();

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        System.out.println("Are you employed?: [true/false] ");
        boolean isEmployed = input.nextBoolean();

        System.out.println("Are you a student?: [true/false] ");
        boolean isStudent = input.nextBoolean();

        String personInfo = firstName + " " + lastName + " is employed: \n" + isEmployed + "  is a student: \n" + isStudent;
        System.out.println(personInfo);

    }
}

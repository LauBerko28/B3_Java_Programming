package day09_a_scanner;

import java.util.Scanner;

public class UseNext {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is today"); // here I dont need to enter an input.nextLine(); as this is the first statement and it is not affected by previous Scanner method inputs
        String day = input.nextLine();

        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your last name");
        String lastName = input.next();

        input.nextLine(); // print an empty input.nextLine(); to capture the ENTER/RETURN from previous Scanner method

        System.out.println("Enter your address: ");
        String address = input.nextLine();

        System.out.println("Enter job tittle");
        String jobTittle = input.nextLine(); // here we did not need to handle it because it is required for any OTHER Scanner methods if they are before nextLine();

        System.out.println("Today: " + day);
        System.out.println("First Name: " + firstName);
        System.out.println("lastName: " + lastName);
        System.out.println("address: " + address);
        System.out.println("jobTittle: " + jobTittle);


    }
}

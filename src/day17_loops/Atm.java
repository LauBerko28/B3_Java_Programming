package day17_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int validPin = 9812;
        int userInput;
        int attempts = 0;

        System.out.println("Welcome to ATM");

        do{
            System.out.println("Please enter your pin: " );
            userInput = key.nextInt();
            attempts++;

        }while (attempts < 3 && userInput != validPin ); // as long as the user gives me a valid pin

        if (validPin == userInput) {
            System.out.println("Logged IN");
        } else {
            System.out.println("LOCKED OUT. COME AFTER A WEEK");
        }




    }
}

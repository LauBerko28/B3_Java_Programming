package day12_switch_statements;

import java.util.Scanner;

public class Atm {
    public static void main (String []args){

        Scanner input = new Scanner (System.in);
        System.out.print("***WELCOME to ATM***\nPlease insert your card.\nType your pin code: ");

        int userInputPin = input.nextInt();

        int expectedPin = 6789;
        double balance = 1_000_000;

        // OUTER IF - NESTED IF
        if (userInputPin == expectedPin){
            System.out.println("\nYou are logged in");

            System.out.println("Select a number for your need: ");
            System.out.println("\t1 - Check Balance");
            System.out.println("\t2 - Withdraw");
            System.out.println("\t3 - Deposit");
            System.out.println("\nYour choice: ");

            // INNER IF ~ CHILD IF ~ NESTED IF
            int option = input.nextInt();
            if (option == 1){
                System.out.println("Your balance is $ " + balance);
            } else if (option == 2){
                System.out.print("How much do you want to withdraw? $");
                double withdrawAmount = input.nextDouble();
                System.out.println("Stand by..... withdrawing $" + withdrawAmount);
                balance -= withdrawAmount;
                System.out.println("After withdraw, your balance is " + balance);

            } else if (option == 3){
                System.out.println("Please insert the money: ");
                double deposit = input.nextDouble();
                balance += deposit;
                System.out.println("After deposit your balance is $" + balance);
            } else {
                System.out.println("Invalid selection. Exiting the account");
            }
            System.out.println("if you have withdrawn, or deposited, or did nothing, your balance is $" + balance);

        }else{
            System.out.println("Invalid pin code. Come back tomorrow");
        }
    }
}

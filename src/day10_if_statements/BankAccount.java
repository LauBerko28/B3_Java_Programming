package day10_if_statements;

import java.util.*;
/*
    Task: Hard code -> Dynamic

    Create a double value for the account balance. // 100
    Create a double value for how much you want to withdraw // 500

    Check the balance after the withdrawal
        if you tried to withdraw more money than you had in the account add a negative overdraft fee to the balance: -100

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over

 */

public class BankAccount {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("What is your balance: $");
        double balance = key.nextDouble(); // hardcoded value

        System.out.println("How much do you want to withdraw? $");
        // double withdraw = 500;// hardcoded
        double withdraw = key.nextDouble(); //Dynamic

        //balance = balance - withdraw; // regular way
        balance -=withdraw; //shorthand operator

//        System.out.println("Your current balance: " + balance);
//        balance -=withdraw + 100;

        if (balance < 0 ) {
            System.out.println("You took too much money. $100 overdraft fee will apply");
            balance -= 100;
            System.out.println("Your balance after fee $" + balance);
        }else{
            System.out.println("Your balance after withdra is $" + balance);
        }






    }
}

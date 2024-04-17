package day09_a_scanner;

import java.util.Scanner;

/*
    Ask the user to enter an int number. Determine if the number is even or odd
    Print a boolean for both even and odd
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
       int num = input.nextInt(); //

        boolean isEven = num % 2 ==0;
        boolean isOdd = num % 2 != 0 ; // [the following will work with positive numbers]  num % 2 == 1; or num % 2 > 0;

        System.out.println(num + " is even: " + isEven);
        System.out.println(num + " is odd: " + isOdd);



    }
}

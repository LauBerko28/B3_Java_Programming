package day12_switch_statements;

import java.util.Scanner;

/*

   you will have a number

   if the number is divisible by 3 print -> Fizz
   if the number is divisible by 5 print -> Buzz
   if the number is divisible by both 3 and 5 -> FizzBuzz
   if the number is not divisible by any of those, print just the number

 */
public class FizzBuzz {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = key.nextInt();  //15


        if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if ( num % 5 == 0) {
            System.out.println("Buzz");
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FzzBuzz");
        }


// Option 1
        if (num % 3 == 0 && num % 5 != 0) {
            System.out.println("Fizz");
        } else if ( num % 5 == 0 && num % 3 != 0) {
            System.out.println("Buzz");
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FzzBuzz");
        }


// Option 1
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if ( num % 5 == 0 ) {
            System.out.println("Buzz");
        } else if (num % 3 == 0 ) {
            System.out.println("Fizz");
        }

    }


}
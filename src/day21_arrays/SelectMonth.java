package day21_arrays;
/*

    Ask the user the month number they want, print the month name

    1 --> January

    12 --> December

    Assume only valid numbers are given, but as a challenge you can handle invalid numbers

 */

import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a number so I can return you the month name related to that number.");
        System.out.print("Enter: ");
        int num = key.nextInt();

        String [] month = {"January","February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        //                      0         1         2        3       4       5       6        7            8        9           10          11
        // if i were to print the length of the Array it'll be 12

        //System.out.println(month[0]); // this will give me the first month
        //System.out.println(month[month.length-1]); // this will give me the last month

        /*
        if(num>= 1 && num <=12) { // i do this to make sure the user gives me a valid number

            System.out.println("The number you entered is " + month[num - 1]);
        } else {
            System.out.println("wrong input"); // System.out.println("wrong input, try again between 1 and 12") --> with the try again will have to add a loop to it. because i dont know how many times the user will take until it gives me a valid number, then I do a WHILE LOOP thatm will run at least once
        }
*/
        // LAU WATCH THE VIDEO ON YOUR PHONE WITH THIS EXPLANATION FROM 05/04
        do {

            System.out.print("Enter: ");
            num = key.nextInt();

            if (num >= 1 && num <= 12) {
                System.out.println("The number you entered is: " + month[num-1]);
            } else {
                System.out.println("Wrong Input. There is no month for that number: " + num + " Try again!");
            }


        } while (num < 1 || num > 12);

        //Positive test: Making sure I am getting expected result for the VALID INPUTS
        // Negative test: Making sure I am getting expected "Error" or whatever is my expected for INVALID INPUT
    }
}

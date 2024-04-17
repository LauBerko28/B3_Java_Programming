package day10_if_statements;

import java.util.Scanner;

/*
            create a int variable to represent the month number, where 1 is January and 12 is December.
        use the month number input to determine how many days are in that month.
        use the following data to help you determine the number of days in each month:

            Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
            Months that has 30 days: 4, 6, 9, 11
            Month that has 28 days: 2

            ex:
                12
                31 days

            ex:
                9
                3

   */
public class DaysInMonth {
    public static void main(String[] args) {

        Scanner key =  new Scanner(System.in);
        System.out.print("Enter a number between 1 and 12 representing the month of the year: ");
        int month = key.nextInt();

        boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;
        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;
        boolean has28Days = month == 2;

        if (has31Days) {
            System.out.println("This month has 31 days");
        }

        if (has30Days) {
            System.out.println("This month has 30 days");
        }

        if (has28Days) {
            System.out.println("This month has 28 days");
        }

        // above 3 single if statement  will be executed separately,


        System.out.println("------------------------------------");

        if (has31Days) {
            System.out.println("This month has 31 days");
        } else if (has30Days) {
            System.out.println("This month has 30 days");
        } else if (has28Days){
            System.out.println("This month has 28 days");
        } else {
            System.out.println("The number you gave is not in the range of 1 and 12");
        }

        if (6> 10){
            System.out.println("sure");

        }


    }
}

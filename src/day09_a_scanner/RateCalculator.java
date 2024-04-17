package day09_a_scanner;
/*
    write a program for a rate calculator: RateCalculator
        1. asks the user to enter a  annual salary (double)
        2. asks the user how many hours he/she works in a week (as int)
        3. print the hourly rate (double) of the employee salary
            assume that one year has 52 weeks
            hourly rate = salary / (hours weekly * 52)
 */
import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your annual/yearly salary? $");
        double salary = input.nextDouble(); // 120,000.00

        System.out.print("How many hours do you work per week?:  ");
        int hoursPerWeek = input.nextInt(); // 40

        double hourlyRate = salary / (hoursPerWeek * 52);

        System.out.println("With the annual salary of $" + salary + " and working for " + hoursPerWeek + " hours per week, your hourly rate is $" + hourlyRate);

    }
}

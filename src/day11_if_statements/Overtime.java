package day11_if_statements;
/*
    create a double variable for your hourly rate
    create a double variable for the number of hours worked per week

    calculate your net pay, with consideration of overtime pay

        if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
            (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
 */
import java.util.Scanner;

public class Overtime {
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        System.out.print("Enter yout hourly rate: $");
        //double hourlyRate = 40; //hardcoded
        double hourlyRate = key.nextDouble(); // dynamic

        System.out.println("Enter the total hours worked: ");
        double numOfHours = key.nextDouble(); // ---> 43

        double netPay;
        String message = " ";

       // boolean isOvertime = numOfHours > 40;
       // double overTimeRate = hourlyRate * 1.5;

        if (numOfHours > 40){ // 43 hours ---> 40 * regularRate + 3 * overtimeRate
            // netPay = 40 * hourlyRate; // netPay with regular hours and hourly pay
            netPay =  (40 * hourlyRate) + ( (numOfHours - 40) * (hourlyRate * 1.5 ));
            //      regular 40 hours     + (overtime hours  * overtime rate)
            message = "You worked " + numOfHours + " hours at a rate of " + hourlyRate + ". Since you have overtime, your total pay is $";
            }
        else {
            netPay = numOfHours * hourlyRate;
            message = "You worked " + numOfHours + " hours at a rate of " + hourlyRate  + ". There was NO OVERTIME. Your total pay is $" + netPay;
        }
        System.out.println(message);
    }
}

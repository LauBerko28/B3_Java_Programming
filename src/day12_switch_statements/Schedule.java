package day12_switch_statements;

import java.util.Scanner;

/*
     Task:

        Ask the user to enter which day it is
        print which class we have on that day, and the time of the class

        topic with instructor at time

        challenge:
            make each day flexible

                monday
                Monday
                mon

             reduce repeating code
 */
public class Schedule {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.print("What day do you want to know about? ");
        String day = key.next();
        String information = " ";


        switch (day){
            case "Monday":
            case "monday":
            case "mon":// MON, Mon, monday
            case "MONDAY":
                information = "We have mentor sessions";
                break;
            case "Tuesday": case "Friday":
                information ="We do not have a class";
                break;
            case "Wednesday":
                information = "We have Java classes";
                break;
            case "Thursday":
                information = "We have Java classes";
                break;
            case "Saturday":
                information = "We have Java classes";
                break;
            case "Sunday":
                information = "We have SOFTSKILLS classes";
                break;
            default:
                information = "Not a valid ";
        }
    }
}

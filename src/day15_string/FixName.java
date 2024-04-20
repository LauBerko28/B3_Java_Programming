package day15_string;
/*
    first name
    last name

    fix to print proper name:
    capital first letter, the rest of the letter lowercase,  no extra space
 */

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String firstName = key.next().trim();
        System.out.print("Enter your last name: ");
        String lastName = key.next();

        // tom jERRy --> Tom Jerry

        String fixedFirstName = ("" + firstName .charAt(0) ).toUpperCase() + firstName.substring(1).toLowerCase(); // do it from 1 because 0 is already used TOM --> substring (portion of it) OM , micky --> icky
        String fixedLastName =("" + lastName.charAt(0)).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(fixedFirstName + " " + fixedLastName);


    }
}

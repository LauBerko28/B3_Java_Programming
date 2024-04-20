package day15_string;

import java.util.Scanner;
/*
    Ask the user to enter their first name
    Ask the user to enter their last name
    Print the initials as uppercase letters

    james
    bond
    JB
 */
public class initials {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstName = key.next().toUpperCase().trim();
        System.out.println("please enter your last name: ");
        String lastName = key.next().toUpperCase().trim();

        char first = firstName.charAt(0); // first value of the index
        //String first = "" + firstName.charAt(0);// "" + 'T' --> "T"

        char last = lastName.charAt(0);

        System.out.println("" + first + last); //  when i have char and +-/* it will do a mathematical operation so by adding "" im converting it to a String and it'll take the letters instead of the value from the ASCII table
    }
}

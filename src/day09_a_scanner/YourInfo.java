package day09_a_scanner;

import java.util.Scanner;

/*
    Ask them to enter their favorite book
    Ask the user to enter their age (byte),
    ask them to enter their favorite number (long),
    Print all the values from the inputs
 */
public class YourInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your favourite book: ");
        String bookName = input.nextLine();

        System.out.print("Enter your age: ");
        byte age = input.nextByte();

        System.out.print("Enter your favorite number: ");
        long favouriteNumber = input.nextLong();



        System.out.println("Information: ");
        System.out.println("\t" + age);
        System.out.println("\t" + favouriteNumber);
        System.out.println("\t" + bookName);


    }
}

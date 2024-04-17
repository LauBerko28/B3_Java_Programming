package day09_a_scanner;
/*
    Write a program that asks the user to
        enter a price
        and quantity
        and then calculate the revenue. revenue = price × quantity.
 */
import java.util.Scanner;

public class Revenue {
    public static void main (String []args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the price of the item: ");
        double price = keyboard.nextDouble();

        System.out.print("Enter the quantity of the item: ");
        int quantity = keyboard.nextInt();

        double revenue = price * quantity;
        System.out.println("The revenue is $ " + revenue);



    }
}

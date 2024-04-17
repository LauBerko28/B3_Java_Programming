package day09_a_scanner;

import java.util.Scanner;

/*
    - Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.
 */
public class Order {
    public static void main(String[] args) {

        //OBJECT REFERENCE = OBJECT (PARAMETER);
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a product name: ");
        String productName = input.nextLine();

        System.out.print("Enter the price of " + productName + " $");
        double price = input.nextDouble();

        System.out.print("How many " + productName + " do you want to buy? ");
        int quantity = input.nextInt();

        input.nextLine(); // handling the enter or return issue.
        System.out.print("Enter your full name: ");
        String fullnAME = input.nextLine();

        // "$fullName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
        String orderDetail = fullnAME + ", your order for " + quantity + " " + productName + " has been placed. Your total is $" + (quantity * price);
        System.out.println(orderDetail);

    }
}

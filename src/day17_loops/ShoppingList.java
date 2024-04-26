package day17_loops;

import java.util.Scanner;
/*
repeated actions
ask a user to enter the item
add the item to the shopping list
ask user if they want to add more items

at the end show the whole item list
 */

public class ShoppingList {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        String list = "Shopping List: ";
        String userAnswer;

        do{ // because user will have at least one item, that is why i use do
            System.out.println("Please enter the name of the item: ");
            String userItem =  key.nextLine();
            list = list + "\n\t" + userItem; // here i added the item to the shopping list -- do it like that because i want to update the list, so i keep the original value of List
            System.out.println("Do you want to add more items? ");
            userAnswer = key.nextLine(); // YES, yes, Y, y
            // here i re-assigned the
        }while (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y")); // as this condition is running out of the code block, i need the assigment of the value to be out of the block.
        // this loop will end once the user enters any value different than "yes"
        // if the user types anything besides the "yes", "YES", or "y", the loop will stop the execution
        // the loop will continue the ITERATION / cycle, as long as user enters "yes", "YES", or "y",

        System.out.println(list);


    }
}

package day12_switch_statements;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Welcome to the vending machine.");
        System.out.println("Please select one of the following: \n\tDrinks\n\tSnacks\n\tGums");
        System.out.println("\n\tSelect: ");

        String item = key.next();
        String itemName = " ";

        switch (item){
            case "Drinks":
                System.out.println("\nYou have selected Drinks.\nChoose your drinks by pressing number: \n\t1-Water\n\t2-Soda\n\t3-Juice");
                System.out.println("\n\tEnter: ");
                int drinkOptionNum = key.nextInt();

               if (drinkOptionNum == 1){
                   itemName = "Water";

                } else if (drinkOptionNum == 2 ) {
                   itemName = "Soda";

               } else if (drinkOptionNum == 3 ) {
                   itemName = "Juice";

               } else {
                   System.out.println("Invalid number");
               }break;

            case "Snacks":
                System.out.println("\nYou have selected Snacks.\nChoose your drinks by pressing number: \n\t1-Candy\n\t2-Chips\n\t3-Cookies");
                System.out.println("\n\tEnter: ");
                int snackOptionNum = key.nextInt();
                if (snackOptionNum == 1){
                    itemName = "Candy";

                } else if (snackOptionNum == 2 ) {
                    itemName = "Chips";

                } else if (snackOptionNum == 3 ) {
                    itemName = "Cookies";

                } else {
                    System.out.println("Invalid number");
                }
                break;
            case "Gums":
                System.out.println("\nYou have selected Gums.\nChoose your drinks by pressing number: \n\t1-Mentos\n\t2-Love\n\t3-Turbo");
                System.out.println("\n\tEnter: ");

                int gumOptionNum = key.nextInt();
                if (gumOptionNum == 1){
                    itemName = "Mentos";

                } else if (gumOptionNum == 2 ) {
                    itemName = "Love";

                } else if (gumOptionNum == 3 ) {
                    itemName = "Turbo";

                } else {
                    System.out.println("Invalid number");
                } break;
            default:
                System.out.println("You have selected an invalid option.");

        } //  end of the switch statement
        System.out.println("\n\tVending....... " + itemName);


    } // end of the main method
} // end of the class

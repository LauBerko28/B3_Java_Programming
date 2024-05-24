package day29_arraylist;

import javax.swing.plaf.multi.MultiSeparatorUI;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        // reference  =  object
        // how can i call the methods i use the var name and . -EX: input.nextLine()


        ArrayList <String> shoppingList = new ArrayList<>();
        // how can i call the methods i use the var name and . -EX: shoppingList.add ....

        /*
        if (shoppingList.isEmpty()){
            System.out.println("Shopping List is empty");

        }else {
            System.out.println("you have some items ");
        }
        */

        System.out.println(statusOfShoppingList(shoppingList));
        String UserAnswer = "";

        do {
            System.out.println("Enter the item");
            shoppingList.add(input.nextLine()); // here im basically assigning anything the user gives me to the array directly

            System.out.println("Do you want to continue y/n: "); // as long as the user says they want to add something then i'll continue asking that is why i need to do a do while loop
            UserAnswer =  input.nextLine();


            System.out.println(shoppingList.isEmpty() ? "Shopping List is empty" : "you have some items ");
        } while (UserAnswer.equalsIgnoreCase("Yes") || UserAnswer.equalsIgnoreCase("y")); // ask as long as user says "Yes", "yes", "y", "Y"

        // loop through list  because i just want to loop to see each element
        System.out.println("Shopping list has" + shoppingList.size() + " items:");

        for ( String eachItem : shoppingList){
            System.out.println("\t" + eachItem);
        }



        System.out.println(statusOfShoppingList(shoppingList));
        System.out.println("****************");

        // Check if shopping list as an item: $item is on list / $item is not on list
        System.out.println("What item do you want to check if it is in the list");
        // input.nextLine(); // lets say word is hat now and i want to check if exists in the list

        itemAvailability(shoppingList, input.nextLine()); // everytime the user gives me an item im sending it to the class itemAvailability to check if its there and im passing that information the user gave me through my arralist to se eif the item is there or not

        System.out.println("*************************");

        System.out.println("Do you want to remove any item? ");
         // if it is yes
        if (input.nextLine().equalsIgnoreCase("yes") ){
            System.out.println("what item do you want to remove? ");
            String itemRemove = input.nextLine(); // here is where the user will give me the item to remove
           //  shoppingList.remove(input.nextLine()); --> here i can remove by the element

            // "1" -- "Bread" --> the user can give me a number or an element so i have to cover both cases
            if (Character.isDigit( itemRemove.charAt(0))){ // i use charat(0) is because it Character class works only with single characters, so i need to provide single character *** isDigit only accepts chars

                int num = Integer.parseInt(itemRemove);  // here im converting the String number they provided to an int

                        shoppingList.remove(num -1);// user will give me lets say 1 (which means first item) and im removing by index that is why i need to do num -1 so i can actually get to that index
            }
            else {
                shoppingList.remove(itemRemove);
            }
        }
        System.out.println("Final List = " + shoppingList);


    }

    public static String  statusOfShoppingList (ArrayList <String> sl){
        /* OPTION 1
        String str = "";
        if (sl.isEmpty()){
            return "Shopping List is empty";
        }else {
            return "you have some items ";
        }
        */

        // OPTION 2
        return sl.isEmpty() ? "Shopping List is empty" : "you have some items ";
    }

    public static void itemAvailability (ArrayList<String> sl ,  String itemToCHeck) {
        System.out.println( sl.contains(itemToCHeck) ? itemToCHeck + "is on list" : itemToCHeck + " is not on the list");

    }
}

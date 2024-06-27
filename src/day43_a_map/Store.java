package day43_a_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

        Map<String, Double> store = new HashMap<>();
        store.put("Water",1.9); // (id, itemName)
        store.put("Coffee", 2.5);
        store.put("Apple", 0.99);
        store.put("Bread", 2.25);
        store.put("Milk", 3.89);

        /*Store Inventory
                Item: $itemName for $$price

         */
        //OPTION 1
        System.out.println("Store Inventory");
        // this time i need to print item and price so i can use the ketSet()
        for (String eachItem : store.keySet()){ // we used .keySet() method to get all the KEYs and loop through them to get each key
            System.out.println("\tItem: " + eachItem + " for $" + store.get(eachItem)); // store.get(eachItem) --> will give me the price (value) of each item
        }
        /*
        Store Inventory
	        Item: Water for $1.9
	        Item: Apple for $0.99
	        Item: Coffee for $2.5
	        Item: Bread for $2.25
	        Item: Milk for $3.89
         */

        System.out.println("*****************");
        //OPTION 2
        System.out.println("Store Inventory");
        for (Map.Entry<String,Double> eachPair: store.entrySet()) {// store.entrySet() --> will give me the key and value on each cycle
            System.out.println("\tItem: " + eachPair.getKey() + " for $" + eachPair.getValue());
        }

        /*
        Store Inventory
	        Item: Water for $1.9
	        Item: Apple for $0.99
	        Item: Coffee for $2.5
	        Item: Bread for $2.25
	        Item: Milk for $3.89
         */

        System.out.println("---------------");
        // How to get all the values?
        System.out.println(store.values()); // will return all the values as Collection [1.9, 0.99, 2.5, 2.25, 3.89]

        System.out.println("---------------");
        System.out.println("What item do you want");
        Scanner scan = new Scanner(System.in);
        String userItem = scan.nextLine();
        System.out.println(    store.containsKey(userItem) ? userItem + " is in stock for $" + store.get(userItem)  : "There is no stock available"   );







    }
}

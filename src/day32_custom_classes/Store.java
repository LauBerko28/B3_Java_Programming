package day32_custom_classes;

import java.util.Arrays;

public class Store {
    public static void main(String[] args) {

        //creating the object of this class
        Food food1 = new Food("Apple"); // this one is calling
        /*
        public Food (String name){
        this.name = name;}
         */
        System.out.println(food1); // Item Apple - 0 x 0.0 = $0.0

        Food food2 = new Food("Chips", 2); // this one is calling
        /*
        public Food (String name, int quantity){
        this(name);
        this.quantity=quantity;}
         */
        System.out.println(food2); // Item Chips - 2 x 0.0 = $0.0
        food2.unitPrice = 1.99;
        System.out.println(food2); // Item Chips - 2 x 1.99 = $0.0 --> i havent called the calculator yet
        food2.calculatePrice(); // here i told it to go to the method calculatePrice and update it
        System.out.println(food2); // Item Chips - 2 x 1.99 = $3.98


        System.out.println();

        Food food3 = new Food("Chicken", 3, 5.99);
        // this one is calling this constructor
        /*
          public Food (String name, int quantity , double unitPrice){
        this(name, quantity);
        this.unitPrice = unitPrice;
        calculatePrice();}
         */
        System.out.println(food3); // Item Chicken - 3 x 5.99 = $17.97


        System.out.println();
        food1.quantity = 10;
        food1.unitPrice = 2.99;
        System.out.println(food1); // Item Apple - 10 x 2.99 = $0.0 --> here i dont see the total price because i have never called the caululateMethod yet
        food1.calculatePrice();
        System.out.println(food1);

        String [] arr = {"one", "two", "three"}; // here  i only created an Array of String - storing String objects

        System.out.println("--------------");

        // each of the objects is food therefore my arraytype should be Food
        Food [] allFood = {food1, food2, food3, null}; // if i want to store all my objects in an Array

        System.out.println(allFood[2]); // Item Chicken - 3 x 5.99 = $18.0

        // How can i check how many elements i have in this food array
        System.out.println("I have a total of " + allFood.length + " different foods"); // I have a total of 3 different foods
        allFood[3] = new Food("Fish", 4, 2.5); // added this information to the position 3 of the array
        System.out.println(allFood[3]); // Item Fish - 4 x 2.5 = $10.0


        System.out.println("============");
        for (Food each : allFood){
            System.out.println(each); // im printing each food object
            /*
            Item Apple - 10 x 2.99 = $30.0
            Item Chips - 2 x 1.99 = $4.0
            Item Chicken - 3 x 5.99 = $18.0
            Item Fish - 4 x 2.5 = $10.0
             */
        }

        System.out.println("=============");
        // Can you calculate what will be my total cost for all foods
        // adding totalPrice for each element of the array
        double totalPriceForAll = 0;
        for (Food each : allFood){
             totalPriceForAll += each.totalPrice; // this will give me the total price for each one of the objects
        }
        System.out.println("Total price for all foods: " + totalPriceForAll);
        // Total price for all foods: 62.0


        System.out.println("*******************");

        System.out.println(Arrays.toString(allFood));
        // [Item Apple - 10 x 2.99 = $30.0, Item Chips - 2 x 1.99 = $4.0, Item Chicken - 3 x 5.99 = $18.0, Item Fish - 4 x 2.5 = $10.0]


        System.out.println("*******************");
        // Find the food which has the total price more than $10

        for (Food each : allFood){
            if(each.totalPrice > 10){
                System.out.println(each.name); // Apple - Chicken

            }
        }
    }

}

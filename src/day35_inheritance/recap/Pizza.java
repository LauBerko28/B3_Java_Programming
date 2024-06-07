package day35_inheritance.recap;

/*
    create a class called Pizza

    - data:

        size (String), number of toppings

    - constructor

        - create a constructor that creates a Pizza object with the length and the width

            call setters here

    - encapsulate the Pizza class

        - setter condition:
            size can only be:
                small, medium, or large

            number of toppings must be a positive number

    - other methods methods:

        - calculatePrice()
                calculate the price of the pizza based on:

                    small base: $4
                    medium base: $6
                    large base: $8

                    each topping adds $0.75 to the price

                    calculate the total price and return the cost

        - toString()
            print the size, number of toppings, and cost of the pizza
 */

public class Pizza {

    // CREATUB==ING MY INSTANCE VARIABLES
    String size;
    int numOfToppings;

    // CREATING A CONSTRUCTOR
    // when it asks for the setter probably doesnt want us to assign to the local variables directly
    public Pizza(String size, int numOfToppings) {
       // this.size = size;
        setSize(size);
        //this.numOfToppings = numOfToppings;
        setNumOfToppings(numOfToppings);
    }

    public void setSize(String size) {
        if(size.equalsIgnoreCase("small")
                || size.equalsIgnoreCase("medium")
                || size.equalsIgnoreCase("large")) {
                this.size = size;
        }
    }

    public void setNumOfToppings(int numOfToppings) {
        if (numOfToppings >= 0){
            this.numOfToppings = numOfToppings;
        }
    }

    // creating instance methods to calculate the price
    public double calculatePrice (){

        if (size == null){
            return -1;
        } // im doing this to take care of the invalid entries


        double basePrice = 0;
        
        if (size.equalsIgnoreCase("small")){
            basePrice = 4.0;
        } else if (size.equalsIgnoreCase("medium")){
            basePrice = 6.0;
            }
        else if (size.equalsIgnoreCase("large")){
            basePrice = 8.0;
        }
        return basePrice + (numOfToppings*0.75);
    }


    // GENERATING MY toString METHOD FOR
    public String toString(){
        String input = "Pizza size: " + size + ", number of toppings: " + numOfToppings + ", the total price is $" + calculatePrice();

        return input;
    }


}

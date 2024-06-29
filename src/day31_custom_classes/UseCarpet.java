package day31_custom_classes;

public class UseCarpet {
    public static void main(String[] args) {

        // created 1 object and provided 4 values because the constructor requires this amount on values
        Carpet carpet1 = new Carpet(true, 8.5,12,2.5);
        // Once the values are provided they'll be assigned to the instance variables
        // carpet1.calculatePrice(); --> can be called here or in the constructor method directly
        System.out.println(carpet1);
        /*
        Carpet Info
	        Width: 8.5
	        Length: 12.0
	        Persian: true
	        Unit Price: 2.5
	        Total Price: $455.0
         */


        // what if after printing the object i wasnt to change the value of one of the values? , i can do it, but for the price to be updated again i must call again the method calculate price

        carpet1.length = 14;
        carpet1.calculatePrice(); // we have to call the calculaterPrice method again because that method was called in constructor.Since we have updated the length,  I am calling .calculateMethod() to get updated totalPrice.


        System.out.println();
        System.out.println(carpet1);
        /*
        Carpet Info
	        Width: 8.5
	        Length: 14.0
	        Persian: true
	        Unit Price: 2.5
	        Total Price: 497.5
         */


    }
}

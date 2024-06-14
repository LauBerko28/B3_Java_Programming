package day38_a_abstraction_interface.shopping;

public class Runner {
    public static void main(String[] args) {
        //Can I create object of Shopping --> No because is abstract

        //Can I create an object of Shipping? --> No because is interface

        // Can I make an object of target? Yes, because is final

        Target target = new Target();
        target.price = 10; // I can do this bc target inherits from Shopping
        System.out.println(target.price);

        target.buyItem(); // bc Target has its own implementation of the abstract method

        target.returnItem(); // bc Target has its own implementation of the abstract method

       // target.payForShipping(true); --> there is no relation between class target and interface Shipping


        System.out.println("------------");

        // Can I make an object of Amazon? Yes, because it is not abstract or interface
        Amazon amazon = new Amazon();
        amazon.price = 100; // i can do this because amazon inherits OnlineShopping which also extends to Shopping class and Shipping interface
        System.out.println(amazon.price);
        amazon.payForShipping(true);
        amazon.buyItem();
        amazon.returnItem();
        amazon.viewCart();
        System.out.println(amazon.COUNTRY); // not good practice to use object name to reach the method
        System.out.println(Shipping.COUNTRY); // Good practice
        System.out.println(Amazon.COUNTRY); // Good practice
        System.out.println(OnlineShopping.COUNTRY); // Good practice


    }
}

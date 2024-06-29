package day30_b_custom_classes;

public class UsingCoffee {
    public static void main(String[] args) {

        Coffee coffe1 = new Coffee(); // created the object (it currently has its own copy of Coffe

        System.out.println(coffe1); // this will call toString method
        /*
        Brand : null
        Type: null
        Size: 0OZ
        Price: $null
         */

        coffe1.price = 4.99;
        coffe1.size = 16;
        coffe1.brand ="Starbucks";
        coffe1.types ="latte";
        System.out.println(coffe1);
        /*
        Brand : Starbucks
        Type: latte
        Size: 16OZ
        Price: $4.99
         */

        coffe1.drink(); // calling method instance drinking
        /*
        public void drink (){
        System.out.println("Drinking " + types + " of coffee");}
        --> Drinking latte of coffee
         */
        coffe1.refill(8.5);
        /*
        will call the method instance of refill
        public void refill(Double num){
        System.out.println("Refilling " + num + "Oz");
        size += num;}
        --> Refilling 8.5Oz
         */
        System.out.println(coffe1.size); //  it'll add my original size to the refill that i did on line 34.  so my size is now 16 + 8.5 and because size is an int i'll have dataLoss and will only see 24

        System.out.println("-------------------");

        Coffee coffee2 = new Coffee();
        System.out.println(coffee2);
        /*
         Brand : null
         Type: null
         Size: 0OZ
         Price: $null
         */
        coffee2.drink(); // null because there is nothing assigned to it yet


    }
}

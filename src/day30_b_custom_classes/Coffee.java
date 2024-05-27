package day30_b_custom_classes;
/*

   Create a coffee class with these instance variables:
        price, size(oz), brand, types

        ex types: black, cappuccino, latte, mocchiato....

   instance methods:

       - make a toString to print all the information of the coffee objects

       - drink(): print: drinking $type of coffee

       - refill(amount in oz): print refilling x oz
           add the number of oz to the total size

    */
public class Coffee {

    // Create a coffee class with these instance variables:
    //        price, size(oz), brand, types
    Double price;
    int size;
    String brand;
    String types;

    // make a toString to print all the information of the coffee objects
    public String toString(){
        String printAll = "Brand : " + brand + "\nType: " + types + "\nSize: " + size + "OZ"+ "\nPrice: $" + price;
        return printAll;
    }

    // drink(): print: drinking $type of coffee
    // because i only want to print i can do it with void
    public void drink (){
        System.out.println("Drinking " + types + " of coffee");
    }

    // refill(amount in oz): print refilling x oz
    //           add the number of oz to the total size
    // refill my cup with this number, that is why i give it parameters

    public void refill(Double num){
        System.out.println("Refilling " + num + "Oz");
        size += num; // adding to the refill what i already had on my cup

    }





}

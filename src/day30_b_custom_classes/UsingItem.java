package day30_b_custom_classes;

public class UsingItem {
    public static void main(String[] args) {

        Item item1 = new Item();

        item1.name = "Apples";
        item1.price = 4.99;

        //System.out.println(item1);
        /*here i will see a memory location because, if i wanted to print all the elements i have 2 options.

        FIRST : directly
        System.out.println(item1.name); --> Apples
        System.out.println(item1.price); --> 4.99

        SECOND: by creating a method instance of toString
        public String toString (){
        String printAll = "Item: " + name + "\nPrice: " + price;
        return printAll;}
        Item: Apples
        Price: 4.99
       */

        System.out.println("---------------");
        System.out.println(item1); // here it goes to the instance method of toString --> Item: Apples Price: 4.99

        Item item2 = new Item(); // created a new object
        // with the below print statement is going to the toString class and printing this one
        System.out.println(item2); // here i will get Item: null Price: null , as nothing has been assigned as a value yet,

    }
}

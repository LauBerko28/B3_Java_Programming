package day30_b_custom_classes;

public class Item { // --> class is my blueprint

    // creating Instance Variables
    String name;
    Double price;

//    OPTION 1 TO CREATE A toString
//    public String toString (){
//
//        String printAll = "Item: " + name + "\nPrice: " + price;
//        return printAll;
//    }

    // OPTION 2 TO CREATE A toString
    // DOING toString with a shortcut --> right-click on the blue-print --> click generate --> click toString --> select all the Instance variables you want to include in this Instance Method
    // i can always move around the way i want it to look

    @Override // If you want, you can remove this "Override" text
    public String toString() {
        return "Item" +
                "\nName:" + name  +
                "\nPrice: " + price;
    }
}

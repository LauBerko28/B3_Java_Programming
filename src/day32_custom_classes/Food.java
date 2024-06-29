package day32_custom_classes;
/*
    create a class called Food

       - data:

           name, quantity, unit price, total price

*/
/*
    - constructor

        - create a constructor that creates a Food object with the name

        - create a constructor that creates a Food object with the name and quantity

        - create a constructor that creates a Food object with the name, quantity, and unit price
            -> call calculatePrice() method here
*/
public class Food {

    //creating my instance variables
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    //create a constructor that creates a Food object with the name
    public Food (String name){
        this.name = name;

    }
    // create a constructor that creates a Food object with the name and quantity
    public Food (String name, int quantity){
        this(name);
        this.quantity=quantity;
    }

    // create a constructor that creates a Food object with the name, quantity, and unit price
    public Food (String name, int quantity , double unitPrice){
        this(name, quantity);
        this.unitPrice = unitPrice;
        //-> call calculatePrice() method here
        calculatePrice();

    }

    public void calculatePrice() {
        totalPrice = Math.round(unitPrice *quantity); // i dont need the this.totalPrice because on the patameter of the class i am not passing any argument i need to differentiate from
    }

    @Override
    public String toString() {
        return "Item " + name + " - " + quantity + " x " +unitPrice + " = $" + totalPrice;
    }
}

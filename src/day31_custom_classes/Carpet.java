package day31_custom_classes;

public class Carpet {

    // creating my instance variables
    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

    // when i dont see the constructor means that i have a default constructor
    public Carpet (boolean inputPersian, double inputWidth, double inputLength, double inputUnitPrice){

        // i dont necessarily have to initialize all my isntance variables


        // here im just saying, what ever the user gives me on the main method on the object argument, will be assigned to each variavle

        // calculatePrice(); --> if i put it here it doesnt have any information to calculate it with  so i will get 0.0
        isPersian = inputPersian;
        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        calculatePrice(); // has to be downhere to be able to use the values needed to calculate the price

    }

    public void calculatePrice(){
        //how can i calculate the total price?
        totalPrice = width * length * unitPrice;
        if (isPersian){ // here im saying if the carpet is persian then add 200 more
            totalPrice += 200;
        }
    }

    @Override
    public String toString() {
        return "Carpet Info" +
                "\n\tWidth: " + width +
                "\n\tLength: " + length +
                "\n\tPersian: " + isPersian +
                "\n\tUnit Price: " + unitPrice +
                "\n\tTotal Price: " + totalPrice;
    }
}

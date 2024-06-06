package day34_a_static;
/*
/*
    Computer - static

    class name: computer:
        instance variables:
            price, brand, color, ...

        static variables: hasScreen, hasBattery, hasMemory

        make objects of the class in a main method and access both instance and static members from proper references

 */

public class Computer {
    // INSTANCE VARIABLES - each object has its own copy
    double price;
    String brand;
    String color;

    // STATIC VARIABLES - all objects share the same copy
    static boolean hasScreen;
    static  boolean hasBattery;
    static boolean hasMemory;

    static {
        System.out.println("Running static block");
        // INITIALIZING STATIC VARIABLES
        hasScreen = false;
        hasBattery = true;
        hasMemory = true;
    }

    // CREATE A CONSTRUCTOR - DOESNT HAVE A RETURN TYPE - ALWAYS CALLED THE SAME AS THE CLASS
    public Computer(double price,String brand, String color){
        System.out.println("Running constructor ");
        this.price = price; // comp1.price = 500;
        this.brand = brand;
        this.color = color;

    }

}

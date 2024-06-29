package day34_a_static;

import java.lang.annotation.Documented;

public class ComputerLab {
    public static void main(String[] args) {

        Computer comp1 = new Computer(500,"HP", "Silver");

        Computer.hasBattery = false;
        System.out.println(Computer.hasBattery); // False

        Computer comp2 = new Computer(400,"Dell", "Black");

        System.out.println(comp1.hasBattery);
        System.out.println(comp2.hasBattery); // i can access it like this but it is not a good practice


        // i can access it like this but it is not a good practice
        comp2.hasBattery = true;
        System.out.println(comp1.hasBattery);
        System.out.println(comp2.hasBattery);


    }
}

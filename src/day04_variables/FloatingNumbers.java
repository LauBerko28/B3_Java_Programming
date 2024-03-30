package day04_variables;

public class FloatingNumbers {

    public static void main (String [ ]args){
    //In Java you cannot store fractions. ---> 3/4

        System.out.println(3/4); // 0.75

        // how decimal numbers are stored: 4.5 or 5.99

        //option 1
        double price = 3.99; // this is used for DECIMAL numbers almost always

        float average = 0.19F;

        System.out.println(price); // here the data type is double
        System.out.println(average); // here the data type is: float
        System.out.println(4.5); // here by default the datatype is double
    }




}

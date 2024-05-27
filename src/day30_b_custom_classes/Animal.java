package day30_b_custom_classes;

public class Animal {

    //Creating Instance variables
    String species;  // default value is null
    long population; // default value is 0



    // this is a special method. This will help me to print object directly. it still does not have the static, but is still a return type
    // If method does nto have static i cannot call it by the className, that is why the instance methods are being called by the object name
    // it helps me print the object directly
    // once we print the object directly, it'll call this method behind the scene
    // If you do not have this method declared, it will print some memory location

    public String toString (){

        // here im just declaring a String variable and doing concatenation
        String print = "Species " + species + "\nPopulation " + population;

        return print;
    }

}

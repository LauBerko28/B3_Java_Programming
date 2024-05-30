package day31_custom_classes;
/*
    Create a class Car

    create instance variables:
    model, year, color, fuel level (percent number)

    create instance methods:

    - toString(): [return String]
        returns all the information of the Car objects

    - drive(): [void]
        prints: driving $model
        subtract 5 from the fuel amount

    - fillTank(): [void]
        prints: filling tank
        fuel level will be maxed at 100

    - isLow() [boolean]
        create a method that will check if the gas level is low.
            return true is the gas level is below 25
            otherwise return false

    Create a separate class to create Car objects and test the methods created
 */
public class Car {
  //  model, year, color, fuel level (percent number)

    // first im creating my instance variables

    String model;
    int year;
    String color;
    double fuelLevel;


    public String toString (){

        String message = "Model: " + model + "\nYear: "+ year + "\nColor: " + color + "\nFuel level: " + fuelLevel;

        return  message;
    }

    public void drive () {
        System.out.println("Driving " + model);
        fuelLevel -= 5;
    }

    public void fillTank (){
        System.out.println("Filling tank " );
        fuelLevel = 100;
    }

    public boolean isLow (){

        return fuelLevel <25;
//        if(fuelLevel < 20){
//            return true;
//        }
//        return  false;
    }

    //
}

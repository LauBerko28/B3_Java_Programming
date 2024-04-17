package day08_scanner_logical_operators;
/*
    create a class called Speeding, and write a program to determine if the car is speeding

            declare 3 variables:
            current speed, speed limit, speeding boolean

            print
            "Are you speeding? " true/false
 */
public class Speeding {
    public static void main (String []args){

        int currentSpeed = 50;
        int speedLimit = 25;
        boolean isSpeeding  = currentSpeed > speedLimit;

        System.out.println("Are you speeding? " + isSpeeding+3); // let's say you can go 3 MPH over, and it's still allowed  --> then this ill print as false


    }
}

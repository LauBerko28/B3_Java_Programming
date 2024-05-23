package day24_methods;

import day19_nested_loops.SpaceProgram;

public class Car {
    public static void unlockCar(){
        System.out.println("Unlocking the car");
    }
    public static void openDoor(){
        System.out.println("opening the door");
    }
    public static void getInTheCar(){
        System.out.println("Sitting in the car");
        System.out.println("Closing the door");
    }
    public static void getReady(){
        System.out.println("Put the seatbelt on ");
        System.out.println("Check the mirrors");
        System.out.println("Turn on the music");
        System.out.println("Set up the navigation");
    }
public static void startingCar(){
    System.out.println("Starting the car");
}

public static void driveAndGo(){
    System.out.println("Putting gear into D");
    System.out.println("Press gas to go forward");
}

public static void goInHurry(){
        unlockCar();
        openDoor();
        getInTheCar();
        startingCar();
        driveAndGo();

}
    public static void main(String[] args) {
        unlockCar();
        unlockCar();
        unlockCar();

        openDoor();

        getInTheCar();

        getReady();

        startingCar();

        driveAndGo();

        System.out.println("------------");
        goInHurry();
        goInHurry();
    }
}

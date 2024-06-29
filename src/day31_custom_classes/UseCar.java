package day31_custom_classes;

public class UseCar {
    public static void main(String[] args) {
        // reference = object
        Car car1 = new Car();
        System.out.println(car1);

        // to reach the method i have to use the object reference

        car1.model = "Tesla";
        car1.year = 2020;
        car1.fuelLevel = 80;
        car1.color = "Red";

        System.out.println();
        System.out.println(car1);

        System.out.println();
        car1.drive(); // fuel here is now 75 after being updated from .drive() method
        car1.drive(); // fuel here is now 70 after being updated from .drive() method
        System.out.println(car1.fuelLevel); // here fuel level will be 70 as it went through the instance method of drive and updated the fuel dicreasing it by 5 every time. so it started at 80

        System.out.println();
        car1.fillTank(); // fuel went up to 100 after calling instance method fill tank
        System.out.println(car1.fuelLevel); // will jump to fuelLevel method instance and because the tank was already updated it'll print 100


    }
}

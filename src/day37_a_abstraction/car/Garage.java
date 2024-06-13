package day37_a_abstraction.car;

public class Garage {
    public static void main(String[] args) {


        //Car obj1 = new Car(); --> we CANNOT create the object of abstract class, that is why im getting an error here
        //obj1.start();


        Toyota obj2 = new Toyota();
        obj2.start(); // this object will have its own implementation


        Honda obj3 = new Honda();
        obj3.start(); // this object will have its own implementation

        //Both toyota and honda are CONCRETE classes
        // Because they're not  ABSTRACT class, we had to implement it

       // ElectricCar electricCar = new ElectricCar(); --> cannot create objects of abstract classes

        System.out.println();

        Tesla obj4 = new Tesla();
        obj4.start();
        // .start(); it was defined in Car class but implemented in Tesla class
        obj4.charge();
        // .charge() --> it was defined in ElectricCar Class but implemented in tesla class

        // Tesla is a non-abstract Class (CONCRETE Class), so it was required to implement ALL abstract method from all abstract parent classes


    }
}

package day37_a_abstraction.car;

public class Tesla extends ElectricCar{

    // this overrinding comes from the grandparent class (Car Class)
    public void start() {
        System.out.println("Start with the ");

    }

    // this abstract overriting comes from my parent class ElectricCar
    public void charge(){
        System.out.println("Tesla is charging ");
    }

}

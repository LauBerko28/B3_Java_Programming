package day38_b_polymorphism.animal;

public class Reptile extends Animal{

    int numOfLegs;

    @Override
    public void eat(){
        System.out.println("REPTILE is eating ");
    }
}

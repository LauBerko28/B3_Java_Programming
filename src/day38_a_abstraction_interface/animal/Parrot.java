package day38_a_abstraction_interface.animal;

import day37_a_abstraction.language.Language;

// i can use as many interfaces as i want, just make sure i split them by a comma, only one word implements is needed, and that the class is imported

public class Parrot extends Bird implements Flyable, Language {

    @Override
    public void useWings() {
        System.out.println("Parrot is using wings to fly");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is eating seeds");

    }

    @Override
    public void fly(){
        System.out.println("Parrot is flying");
    }

    @Override
    public void hi() {
        System.out.println("HI HI");
    }

    @Override
    public void bye() {
        System.out.println("BYE BYE BYE");
    }
}

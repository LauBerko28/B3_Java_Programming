package day34_c_inheritance.animal;

public class Zoo {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.type = "General Animal";
        a1.numberOfLegs = 0;
        a1.walk();
       // a1.roar(); --> INVALID - Parent class cannot access child class members
       // a1.bark(); --> INVALID - Parent class cannot access child class members


        // creating an object for Dog Class
        Dog dog1 = new Dog();
        dog1.type = "German Shepard";
        dog1.walk();  //Child Class can access to Parent class members
        dog1.bark(); // Child class can access its own member
        //dog1.roar(); --> INVALID because neither Dof nor Animal class has that method




        // creating an object for Lion class
        Lion lion1 = new Lion();
        lion1.type = "Arctic Lion";
        lion1.walk();


    }
}

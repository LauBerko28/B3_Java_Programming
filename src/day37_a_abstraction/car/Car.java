package day37_a_abstraction.car;


// Abstract method tells me there is something but not how it'll be implemented
// Abstract classes cannot be static, because static belongs to the class not the object
// abstract method cannot be final, because abstract requires me to do overriting
// abstract cannot be private

public abstract class Car {
    // why would i create the Abstract? because I want that once the class is extended (parent/child), whomever creates an object MUST create a "new version" of the same

    // to make a class abstract i need to add the word abstract in the declaration of the class ass well

    // public void start(); --> if i want to have a method without implementation i cannot do it like this

//    public void start(){
//        System.out.println("Car is running");
//    }

    // public void test(){ --> this one is my instance method --> child classes are not forced to implement this method

    public abstract void start(); // --> this is an abstract method // child classes are forced to implement this method





}

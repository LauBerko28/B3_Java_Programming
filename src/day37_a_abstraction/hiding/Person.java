package day37_a_abstraction.hiding;

public class Person {
    String name = "Mickey Mouse";

}


class SecretIdentity extends Person{

    String name = "Winnie Pooh"; // we created another "name" variable in the child class
    // even though i inherit the name variable from the parent class, as soon as i assigned a new value to it on this class, the one from the parent class gets HIDDEN

}

class Runner{
    public static void main(String[] args) {
        //created an object of the first class
        Person person = new Person();
        System.out.println(person.name);


        // creating an object of the second class
        SecretIdentity secretIdentity = new SecretIdentity();
        System.out.println(secretIdentity.name);
    }
}

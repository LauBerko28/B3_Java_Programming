package day38_b_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {

        // #1 - all possible reference / object - Lizard
        // Reference Itself
        Lizard l1 = new Lizard();
        l1.eat();
        l1.name = "lizard";
        System.out.println(l1.name);


        // #2 -  all possible reference / object - Reptile
        Reptile r1 = new Reptile();
        r1.eat();
        r1.name = "reptile";
        System.out.println(r1.name);

        System.out.println("--------------");
        //Reference super/Parent
        Animal l2 = new Lizard(); // reach the eat() method from parent, but run the version of object side
        // if i dont have the object on the child class, but have one on the parent class, then it'll run the one from the parent class
        // if child does not have overriden version of eat(), then it'll run the one from parent
        l2.eat();
        // LIZARD is eating
        //the reference side determines the accessibility
        Animal r2 = new Reptile();
        r2.eat();
        // REPTILE is eating
    }
}

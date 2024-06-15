package day38_b_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {

        // #1 - all possible reference / object - Lizard
        // Reference Itself
        Lizard l1 = new Lizard();
        l1.eat(); // this .eat() method is accessible with the object
        l1.name = "lizard";
        System.out.println(l1.name);
        l1.numOfLegs =10;
        System.out.println(l1.numOfLegs); // --> since .numOfLegs is inherited from the reptile class, i can still access it
        l1.skinColor ="Camo";
        System.out.println(l1.skinColor); // this one is coming directly from its on class so i can access it


        //System.out.println(new Lizard().name); --> this will give me null bc is a completely new obj
        //Reference parent
        Reptile l2 = new Lizard(); // ---> creating an object lizard with reference reptile
        l2.eat(); // if i dont have an .eat() method in the reference class (or the parent of that one) then it'll not be able to access or run that method
        l2.name = "lizard2";
        System.out.println(l2.name);
        l2.numOfLegs = 12;
        //l2.skinColor = "camo 2 "; --> the variable skinColor is not part of Reptile which is the reference side
        System.out.println(l2.numOfLegs);
        System.out.println();


        //Reference - Grand parent
        // reference determines the accessibility, and the object refers to what the code will run which is its own version
        Animal l3 = new Lizard();
        l3.eat(); // if i dont have an .eat() method in the reference class (or the parent of that one) then it'll not be able to access or run that method
        l3.name = "lizard3";
        System.out.println(l3.name);
       // l3.numOfLegs = 14; --> animal reference does not have access to numOfLegs
        //l3.skinColor = "camo 2 "; --> the variable skinColor is not part of Reptile which is the reference side
        //System.out.println(l3.numOfLegs);
        System.out.println();

        /**
         * We created 3 object of Lizard
         * 1 - Reference was to itself - LIZARD
         * 2- Reference was parent class - REPTILE
         * 3- Reference was GRAND PARENT class - Animal
         */

        // #2 - all possible reference / object - Reptile
        // reference itself - Reptile
        // Referemce Parent - Animal
        // Animal r1 = new Reptile();
        // r1.numOfLegs = 20; --> false because with the reference animal i dont have access to numOfLegs




//        // #2 -  all possible reference / object - Reptile
//        Reptile r1 = new Reptile();
//        r1.eat();
//        r1.name = "reptile";
//        System.out.println(r1.name);
//
//        System.out.println("--------------");
//        //Reference super/Parent
//        Animal l2 = new Lizard(); // reach the eat() method from parent, but run the version of object side
//        // if i dont have the object on the child class, but have one on the parent class, then it'll run the one from the parent class
//        // if child does not have overriden version of eat(), then it'll run the one from parent
//        l2.eat();
//        // LIZARD is eating
//        //the reference side determines the accessibility
//        Animal r2 = new Reptile();
//        r2.eat();
//        // REPTILE is eating
    }
}

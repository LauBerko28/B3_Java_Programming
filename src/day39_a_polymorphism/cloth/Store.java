package day39_a_polymorphism.cloth;

import day38_a_abstraction_interface.shopping.Target;

import java.rmi.server.RemoteObjectInvocationHandler;
import java.util.EventListener;

public class Store {
    public static void main(String[] args) {

        // ALL possible references of TShirt
        // #1 -ITSELF
        TShirt t1 = new TShirt();
        t1.wear(); // Wearing a TShirt...

        // #2 - PARENT CLASS
        Clothes t2 = new TShirt();
        t2.wear(); // Wearing a TShirt...
        // in the reference i do have a wear() method in so i can use it, but when running it'll take the one from the child class

        System.out.println("-----------------");
        // ALL possible references of Jacket
        // #1 -ITSELF
        Jacket j1 = new Jacket();
        j1.wear(); // Wearing a Jacket....
        j1.putOnHood(); // Putting Jackets Hood on

        // #2 - PARENT CLASS
        Clothes j2 = new Jacket();
        j2.wear(); // Wearing a Jacket....
        // j2.putOnHood(); --> in Clothes i dont have a method called putOnHood();

        //# 3 - INTERFACE
        HasHood j3 = new Jacket();
        j3.putOnHood(); // Putting Jackets Hood on
       // j3.wear(); --> HasHood reference does not have access to .wear() method

        //# 4 - Object
        Object j4 = new Jacket();
        //j4.wear() --> object reference does not have access to .wear() method
        //j4.putOnHood() --> object reference does not have access to .putOnHood method

        System.out.println("-------------");
        // buy(); --> to be able to access this method (form the below class, it has to be static bc static (as the main method) can only accept static
        // References -> TShirt ITSELF  TShirt ts = new TShirt();
        // References -> Clothes PARENT  Clothes ts = new TShirt();
        TShirt ts = new TShirt();

        // References -> Jacket ITSELF  TShirt ts = new Jacket();
        // References -> Clothes PARENT  Clothes ts = new Jacket();
        // References -> HasHood interface  HasHood ts = new Jacket();

        Jacket jt = new Jacket();

        buy(ts); // buy ( new TShirt() );
        buy(jt);  // buy (  new Jacket() );
        buy (new TShirt()); // here im just creating an object directly

        HasHood jj3 = new Jacket();
        buy( (Jacket)jj3) ; //  HasHood jj3 = new Jacket(); -- > Jacket jj3 = new Jacket();
        //buy( (jj3) ); //  HasHood jj3 = new Jacket(); -- > Clothes close cannot accept HasHood jj3

    }

    public static void buy(Clothes clothes) { //Clothes clothes = new TShirt();

        if (clothes instanceof TShirt) {
            System.out.println("Bought Tshirt"); //Clothes clothes = new TShirt(); --> new TShirt(); is instanceOfTShirt
            //Clothes clothes = new TShirt(); --> new TShirt(); is an instance of TShirt --TRUE
            //Clothes clothes = new Jacket(); --> new Jacket(); is an instance of TShirt -- FALSE

        } else if (clothes instanceof Jacket) {
            System.out.println("bought Jacket");
            //Clothes clothes = new Jacket(); --> new Jacket(); is an instance of Jacket --TRUE
        }

        //INSTANCE OF is checking that the object you're sending to me belongs to this class
    }
}

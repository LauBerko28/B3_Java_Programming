package day36_inheritance.access.b;
// Different package - Different class
import day36_inheritance.access.a.Fitst;

public class Third {
    public static void main(String[] args) {
        Fitst obj = new Fitst();
        System.out.println(obj.one); //instance var is public access mod so i can access it anywhere in the project
       // System.out.println(obj.two); since two has protected access modifier, and since there is no IS-A relation between Thirds class are in different packages, we CANNOT have access
       //System.out.println(obj.three); Since three is default access mod, can access from anywhere in the same package
        //System.out.println(obj.four);Since four is private access mod, can access ONLY from the same class

        Third obj2 = new Third();
        /* Since there is no relation between the class (parent/child class) i cannot access to those variables
        obj2.one;
        obj2.two;
        obj2.three;
        obj2.four;
        */


    }
}

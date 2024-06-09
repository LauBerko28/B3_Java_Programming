package day36_inheritance.access.b;
// Different package - Different class **BUT THERE IS INHERITANCE**
import day36_inheritance.access.a.Fitst;

public class Fourth extends Fitst{
    public static void main(String[] args) {
        Fitst obj = new Fitst();
        System.out.println(obj.one);//instance var is public access mod so i can access it anywhere in the project
        //System.out.println(obj.two);this one doesnt work bc im trying to access it through the object of my parent class
       // System.out.println(obj.three);
        // System.out.println(obj.four);

        Fourth obj2 = new Fourth();
        System.out.println(obj2.one);
        System.out.println(obj2.two); // if i have inheritance in diff package in Java i can have access to the protected variables
        // Since two has protected access modifier, and since there is IS-A relation being in different packages, Since accessible members from Parent can Inherit to child, Child class object can inherit
        // this one works because im creating an object of the class Child i inherit from the parent class thats why i can access the protected var


    }

}

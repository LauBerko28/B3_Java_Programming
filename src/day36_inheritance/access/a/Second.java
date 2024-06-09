package day36_inheritance.access.a;
// Same package - different class
public class Second {

    public static void main(String[] args) {
        // Here i created the object of First class
        Fitst obj = new Fitst();
        // i can access all of the variables because im in the same class and same package
        System.out.println(obj.one); // instance var is public access mod so i can access it anywhere
        System.out.println(obj.two); // Since two is protected access mod, can access from anywhere in the same package
        System.out.println(obj.three);// Since three is default access mod, can access from anywhere in the same package
       //System.out.println(obj.four);Since four is private access mod, can access ONLY from the same class

        Second obj2 = new Second();

       /*
       Since there is no relation between the class (parent/child class) i cannot access to those variables
        obj2.one - obj2.two - obj2.three - obj2.four
        */
    }
}

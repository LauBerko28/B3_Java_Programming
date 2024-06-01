package day33_b_encapsulation.access_modifiers;

//In a DIFFERENT CLASS - SAME PACKAGE
public class AccessInPackage {
    public static void main(String[] args) {

        // IF SOMETHING IS PRIVATE IT IS ONLY ACCESSIBLE IN THE SAME CLASS

        // here i created an object of Access mod
        AccessModifiers obj = new AccessModifiers();
        // i can access the below because they are on the same class and package , we can access public, default and private
        System.out.println(obj.a); // with the object im trying to reach the
        System.out.println(obj.b);
       // System.out.println(obj.c);

        // i can access the below because they are on the same class and package , we can access public, default and private
        System.out.println(AccessModifiers.x);
        System.out.println(AccessModifiers.y);
        // System.out.println(AccessModifiers.z);

        /**
         * NOTE:
         * c and z variables are "private" access modifiers.
         * That is why they are oNLY accessible in the SAME class
         * Here, since we are in a different class, we cannot access the value
         */

    }
}

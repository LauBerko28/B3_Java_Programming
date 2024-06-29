package my_utilities;

import day33_b_encapsulation.access_modifiers.AccessModifiers;


public class AccessOutsidePackage {

    // In a DIFFERENT CLASS - DIFFERENT PACKAGE
    public static void main(String[] args) {

        // here i created an object of Access mod
        AccessModifiers obj = new AccessModifiers();
        // i can access the below because they are on the same class and package , we can access public, default and private
        System.out.println(obj.a); // with the object im trying to reach the
        //System.out.println(obj.b);
       // System.out.println(obj.c);

        // i can access the below because they are on the same class and package , we can access public, default and private
        System.out.println(AccessModifiers.x);
        //System.out.println(AccessModifiers.y);
        //sout.println(AccessModifiers.z);

        /**
         * NOTE:
         * c and z variables are "private" access modifiers.
         * That is why they are oNLY accessible in the SAME class
         * Here, since we are in a different PACKAGE, we cannot access the value
         *
         *
         *
         * b and y variables are "default" access modifiers
         * that is why they are ONLY accessible in the SAME package
         * Here, since we are in a different PACKAGE we cannot accessthe value
         */

    }
}

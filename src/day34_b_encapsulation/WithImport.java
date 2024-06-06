package day34_b_encapsulation;

import static my_utilities.StringUtil.*;
import static my_utilities.ArrayUtil.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;


import static java.util.Arrays.*; // Import all static things in util package specifically Arrays class
//If you do static import, all the non-statoc things are not accessible

// import everything from this package .util specifically this class Arrays
import static java.util.Arrays.*;

public class WithImport {
    public static void main(String[] args) {
        int [] a = {81, 23, 65, 33};
        //Arrays.sort(a);
        sort(a); // here what im doing is just calling the static method without calling the className


        //System.out.println(Math.PI);
        System.out.println(PI);


        //System.out.println(StringUtil.reverse("java"));
        System.out.println(reverse("java"));

        minNumInArray(a);

        // System.out.println(toString(a)); // Since this is a special method. Sometimes it is instance method, that is why Java here does nto know if it is static version




    }
}

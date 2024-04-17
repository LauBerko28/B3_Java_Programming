package day08_scanner_logical_operators;

public class LogicalOperators {
    public static void main (String [] args){

        int n = 20;
        System.out.println(n>5);//true --> line 7 and 8 are not related and are not a range
        System.out.println(n<10);// false


        System.out.println(n > 5 && n < 10);
        //                  true && n <10
        //                  true && false
        //                  false

        System.out.println("----------------");


        System.out.println(4 > 3 || false);
        //                  true || false
        //                  true

        System.out.println(3 > 4 || false );
        //


        System.out.println(!true); // ! means not: not true = false
        System.out.println(!false); // ! means not: not false = true

        System.out.println( 4!= 4); // not equal
        System.out.println(!(4!= 4)); // true
        // four is not equal to four -->  true




    }
}

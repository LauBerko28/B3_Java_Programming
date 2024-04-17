package day08_scanner_logical_operators;

public class ShortCircuit {
    public static void main(String[] args) {
        //System.out.println(5/0);
        System.out.println(true || 5/0 == 0); // short circuit OR --> || ~~ logical operator + arithmetic operator + unary operator
        //System.out.println(true | 5/0 == 0); // OR --> | ***ERROR***

        System.out.println(false && 5/0 == 0); // short circuit AND
        //System.out.println(false & 5/0 == 0); //  AND --> | ***ERROR***

        System.out.println("--------------------------------");
        int a = 0;
        System.out.println(false && a++ == 5);
        System.out.println(a);

        System.out.println(true && a++ == 5);
        System.out.println(a); // a = 1

        int b = 0;
        System.out.println( false & b++ == 5);
        System.out.println(b); //  b = 1

    }
}

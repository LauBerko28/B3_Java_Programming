package day06_a_arithmetic_operators;

public class typeCasting {
    public static void main (String []args){

        int i2t = 100;
       // byte b2 = i2; int is BIGGER than byte, so we must CAST. We CAST the int type variable i2 to a byte type variable
       /* LAURA!! think about the containers drawing - eventhough  byte can hold up to 127 as int is a bigger container and
       has only assign 40 we have to CAST "compress it" to make the byte now fit the int
        */

        byte b = 40;
        int i = b;  // the byte value is AUTOMATICALLY CONVERTED into int, because byte is SMALLER than int

        int i2 = 100;
        byte b2 = (byte)i2; // int is BIGGER than byte, so we must CAST. We CAST the int type variable - i2 to a byte type variable using (byte)
        System.out.println(i2);
        System.out.println(b2); // // this will be same 100 because byte can hold MAX 127, so there will NOT be data loss

        int i3 = 150;
        byte b3 = (byte)i3;
        System.out.println(i3);
        System.out.println(b3); // this will not print 150 because byte can hold MAX 127, so there will be data loss

        // byte b4 = 100; // Here 100 is assigned to byte. We know that byte can hold 100


        int i4 = 500;
        long l4 = i4;  // int is SMALLER than long, so, AUTOMATIC CONVERSION is happening.


        long l5 = 200;
        int i5 = (int)l5;


        double d6 = 50;
        System.out.println(d6);


        double d7 = 60.7;
        int i7 = (int)d7; // there is data loss.
        System.out.println(d7);
        System.out.println(i7);


        double d8 = 40.8;
        byte b8 = (byte)d8;
        System.out.println(d8);
        System.out.println(b8);


        // byte < short < int < long < float < double

    }
}

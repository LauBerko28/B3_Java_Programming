package day08_scanner_logical_operators;
/*
     Task:
        Declare and assign a number

        I want to know the sign of the number
            if the number positive
            is the number negative
            is the number 0
 */
public class SignType {
    public static void main (String [] args){ // method body {}
        int number =-16;

        boolean isPossitive = number > 0;
        boolean isNegative = number < 0;
        boolean iszero = number == 0;

        System.out.println(number + " is possitive: " + isPossitive);
        System.out.println(number + " is negative: " + isNegative);
        System.out.println(number + " is zero: " +iszero);





    }
}

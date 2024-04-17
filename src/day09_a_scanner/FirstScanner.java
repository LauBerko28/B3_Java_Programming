package day09_a_scanner;

import java.util.Scanner;

public class FirstScanner {
    public static void main (String [] args) {

        //#1  - Scanner Object declaration / installation
        // input --> is the object reference name
        Scanner input = new Scanner (System.in); // Scanner Object declaration.
                                                  //System.in take it from this consol, and assign it here
                                                  // input/keyboard is allowing me to connect the keyboarcd and write on the consol

        System.out.println("Please, enter a number: ");

        //#2 - we ger the value from console
        int userNumber = input.nextInt(); // returns input as int --> Therefore I can assist it into int variable
        System.out.println("You entered: " + userNumber);



    }
}

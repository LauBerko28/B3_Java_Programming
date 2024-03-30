package day03_comments_escape_sequence;

import java.sql.SQLOutput;

public class VariableIntro {
    public static void main(String[] args){

        //option - 1
        int quantity1; // this is just: VARIABLE DECLARATION
        quantity1 = 3; // This is just: ASSIGNING VALUE/DATA into VARIABLE
        System.out.println(quantity1);
        quantity1 = 5; // This is just: RE-ASSIGNMENT - I assigned another value to my container
        System.out.println(quantity1);

        // if i use the "" in the print statement when im using the value I assigned it will print
        // the word "quantity1"

        System.out.println("quantity1");

        //Q: What is the data type I used here:
        //A:

        byte n2=4;
        short n3=4;
        int n4=4;

        System.out.println(n2);
        System.out.println(4);

        float d1= 3.4f; // for float i always need to have the letter f/F after the number
        double d2= 3.4;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(4.5);


        //option - 2
        int quantity2 = 4; // This is just: DECLARING VARIABLE and at the same time ASSIGNING VALUE/DATA
        System.out.println(quantity2);


        // Sample for string
        String word = "Anything"; // Here, I declare a string VARIABLE that hold a value/data which
        // is "Anything"
        System.out.println("Anything");
        System.out.println(word);

        char letter = 'a'; // only used for one character * if it has more than one is a string
        System.out.println(letter);

        String letter2 = "ab";

        boolean var1 = true; // can only hold 2 values TRUE/FALSE
        System.out.println(var1);
        boolean var2 = false;
        System.out.println(var1);

//EXAMPLE
//int is a VERBAL
        int result; // declare

        int number1 = 10; //declare and assigned
        int number2 = 5;

        result = number1 + number2;
        System.out.println(result);

    }
}

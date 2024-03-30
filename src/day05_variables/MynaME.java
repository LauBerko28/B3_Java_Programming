package day05_variables;

public class MynaME {
    public static void main(String[] args) {

        char first = 'L';
        char second = 'a';
        char third = 'u';
        char fourth = 'r';
        char fifth = 'a';

        System.out.println(first);
        System.out.println(first + second + third + fourth + fifth); //  INT: everytime i have a + - / * it will read the character by its numeric value
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        System.out.println("third = " + third);
        System.out.println("fourth = " + fourth);
        System.out.println("fifth = " + fifth);
        System.out.println(first + second + third + "" + fourth + fifth); // up to the concatenation it will do the math
        System.out.println( "" + first + second + third + fourth + fifth);

        char letter = 1234;
        System.out.println(letter);


    }
}

package day15_string;

import  java.util.*;
public class FirstAndLast {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = key.nextLine();

        System.out.println("First char: " + sentence.charAt(0));
        System.out.println("Last char: " + sentence.charAt(sentence.length() - 1) ); // sentence.length -1 --> gives me the last one
    }
}

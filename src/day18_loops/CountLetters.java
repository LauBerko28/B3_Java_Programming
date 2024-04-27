package day18_loops;
/*

    Given a String we want to count how many 'a' characters we have

    Challenge: adjust so that we can check for not only 'a' but any character

    Ex: aabbcaa

        4

 */

import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {


        /*
        i will get each character at a time --> word.charAt(index);
         and compare if it matches          --> word.charAt(index) == letter; --- > count = 1   
         */
        Scanner key = new Scanner(System.in);


        System.out.println("Please, enter the sentence/word to check number of the existence of certain character:");
        String word = key.nextLine(); //"aabbcaa";

        System.out.println("Please, enter the character [SINGLE CHARACTER]: ");
        String character = key.next();  // "K"

        while (character.length() != 1) {
            System.out.println("It was not a single character. Please, enter again: ");
            character = key.next();  // "D"
        }



        char letter = character.charAt(0);  // "K"
        int count = 0;

        /*
            I will get each character at a time  --- >  word.charAt(index);
            and compare if it matches            --- >  word.charAt(index) == letter; --- > count = 1
         */

        for (int i = 0; i < word.length(); i++) {           // aabbcaa   | 2            | 3
            char eachCharOnEachCycle = word.charAt(i);      // a         | a            | b
            if (eachCharOnEachCycle == letter) {            // a == a    | a == a       | b == a
                count++;                                    // count = 1 | count = 2    | count = 2
            }
        }

        System.out.println(count);
    }
}

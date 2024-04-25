package day15_string;

import java.util.Scanner;

/*
    create a class LongestWithA
    ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

    Ex:
        "java"
        "mouse"
        "computer"

    Output: java

    Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
 */
public class longestWithA {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter three words:");
        String word1 = key.next().toLowerCase();
        String word2 = key.next().toLowerCase();
        String word3 = key.next().toLowerCase();

        int wordOneLength = word1.length();
        int wordTwoLength = word2.length();
        int wordThreeLength = word2.length();

        if (word1.contains("a") && wordOneLength > wordTwoLength & wordOneLength > wordThreeLength ){
            System.out.println(word1 + " is biggest and has the \"a\" in it");
        }else if (word2.contains("a") && wordTwoLength > wordOneLength & wordTwoLength > wordThreeLength ){
            System.out.println(word2 + " is biggest and has the \"a\" in it");

        }else if (word3.contains("a") && wordThreeLength > wordOneLength & wordThreeLength > wordTwoLength ){
            System.out.println(word3 + " is biggest and has the \"a\" in it");
        }else {
            System.out.println("There is no single biggest word or biggest word does not have\"a\" in it");
        }
    }
}

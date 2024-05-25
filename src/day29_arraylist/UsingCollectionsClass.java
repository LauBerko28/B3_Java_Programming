package day29_arraylist;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
import java.util.*;

public class UsingCollectionsClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3, 6, 2, 27, 40, 234, 38));
        System.out.println(list); // [3, 6, 2, 27, 40, 234, 38]

        //.sort()
        Collections.sort(list);
        System.out.println(list); // [2, 3, 6, 27, 38, 40, 234] --> prints it in ascending way --> this is a vOID method so it does not return anything to me

        // .reverse()
        Collections.reverse(list);
        System.out.println(list); // [234, 40, 38, 27, 6, 3, 2] --> prints it backwards

        System.out.println("****************");

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('A', 'B', 'D', 'C'));
        System.out.println(letters); // [A, B, C, D]
        Collections.sort(letters); //  because return type is void then i cannot print it out directly
        System.out.println(letters); // [A, B, C, D]
        Collections.reverse(letters);
        System.out.println(letters); // [D, C, B, A]

        System.out.println("****************");
        // max () and min ()
        // 3, 6, 2, 27, 40, 234, 38
        System.out.println(Collections.max(list)); // 234 here it has a  return type then i can print it out directly
        System.out.println(Collections.min(list)); // 2


        // .swap();
        Collections.swap(letters, 0, 3); // --> go to this arrayList and change the index of 0 for the index of 3
        System.out.println(letters); // [A, C, B, D]


        // .frequency() --> returns the number of times of a given element in a collection
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11, 11, 20, 11, 20, 30));
        // ["a", "b", "a", "c", "d"]
        // "aaabbccccddee"
        System.out.println(Collections.frequency(numbers, 11)); // returns me int 3 because 11 is repeated 3 times in the collection --> hey go to the collection and check how many times i have this element


        String str = "aaabbccccddee";
        ArrayList<String> word = new ArrayList<>(Arrays.asList(str.split(""))); // ["a
        //1. convert to array
        // 2.

        String checked = ""; // i jusr created this so i dont get the same letter repetedely

        for (String each :word) {
            if (!checked.contains(each)) { // if it doesnt contain then go ahead and add each
                System.out.println(each + ": " + Collections.frequency(word, each)); // a: 3 a: 3 b: 2 b: 2 c: 4 c: 4 c: 4 c: 4 d: 2 d: 2   e: 2 e: 2  //              this will return me the amount of times the Character is there
                checked += each; // a: 3 b: 2 c: 4 d: 2 e: 2
            /*


             */
            }
        }


        ArrayList <String> strArrList = new ArrayList<>(Arrays.asList("one", "two", "five", "ten"));
        System.out.println(Collections.frequency(strArrList, "six")); // 0 because it doesnt exist in the collection
        System.out.println(Collections.frequency(strArrList, "five")); // 1 because is only there once
        System.out.println(Collections.frequency(strArrList, "ten")); // 1 because is only there once


    }
}

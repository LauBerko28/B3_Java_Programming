package day30_a_arraylist;

/*
    Remove Duplicates
    Create a method that will take an ArrayList of numbers and remove any duplicates values.
    The method will return an ArrayList of unique elements.

    @param nums - The given ArrayList of numbers @return - ArrayList of numbers

        Ex:
        Input: {1, 3, 5, 1, 4, 5, 9};
        Output: {3, 4, 9};
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class RemoveDuplicateNumbers {

//    public static ArrayList<Integer> uniqueList (ArrayList<Integer> nums){
//
//        ArrayList <Integer> unique = new ArrayList<>(); // created a new arrayList to store the unique nums
//
//        unique.removeIf(each -> Collections.frequency(nums, each) > 1);
//
//        /*
//        [1, 3, 5, 1, 4, 5, 9]
//
//        1st
//            1 -> Collections.frequency([1, 3, 5, 1, 4, 5, 9], 1) > 1 --> 2 > 1 hey go to the list and check how many times the number is there if more than 1 remove it
//
//        2nd
//                3 -> Collections.frequency([3, 5, 4, 5, 9], 3) > 1 ---- > 1 > 1
//
//            3rd
//                5 -> Collections.frequency([3, 5, 4, 5, 9], 5) > 1 ---- > 2 > 1
//
//            4th
//                4 -> Collections.frequency([3, 4, 9], 4) > 1 ---- > 1 > 1
//
//            5th
//                9 -> Collections.frequency([3, 4, 9], 9) > 1 ---- > 1 > 1
//
//
//         */
//
//        //Collections.frequency(nums, 1); // as the task asks for the unique nums i need to know the frequency of them
//
//        return unique;  // return my unique num array
//
//    }
//
//    public static void main(String[] args) {
//
//        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList( 1, 3, 5, 1, 4, 5, 9));
//        System.out.println(nums);
//        System.out.println(uniqueList(nums));
//    }
public static ArrayList <Integer> uniqueList (ArrayList <Integer> nums) {

    ArrayList <Integer> uniques = new ArrayList<>(nums);

    uniques.removeIf( each ->  Collections.frequency(nums, each) > 1 );

        /*
            [1, 3, 5, 1, 4, 5, 9]

            1st
                1 -> Collections.frequency([1, 3, 5, 1, 4, 5, 9], 1) > 1 ---- > 2 > 1

            2nd
                3 -> Collections.frequency([3, 5, 4, 5, 9], 3) > 1 ---- > 1 > 1

            3rd
                5 -> Collections.frequency([3, 5, 4, 5, 9], 5) > 1 ---- > 2 > 1

            4th
                4 -> Collections.frequency([3, 4, 9], 4) > 1 ---- > 1 > 1

            5th
                9 -> Collections.frequency([3, 4, 9], 9) > 1 ---- > 1 > 1

         */


    return uniques;
}


    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList( 1, 3, 5, 1, 4, 5, 9));
        System.out.println(nums);
        System.out.println(uniqueList(nums)); // [3, 4, 9]
        System.out.println(nums); // [1, 3, 5, 1, 4, 5, 9]

    }
}

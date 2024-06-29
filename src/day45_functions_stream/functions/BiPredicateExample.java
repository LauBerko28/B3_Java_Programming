package day45_functions_stream.functions;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        // <T, U> --> accepts two Objects (any), and returns boolean --> abstract method name: boolean test(T t , U u)

        BiPredicate <Integer [], Integer> contains = (arr, num) ->{
            for(Integer each : arr){
                if (each == num){ // if this is true, my array contains the num, so we return true and end the loop and implementation
                    return true;
                }
            }
            return false;

        };

        Integer [] arr = {1,2,3,4,5};
        // now i have to call my implementaion ref+method name
        System.out.println(contains.test(arr, 56)); // go ahead and check if the number 56 is part of the array



        BiPredicate <Integer [], Integer> contains2 = (arr2, num) ->{
            return Arrays.asList(arr2).contains(num); // Lets improve the code to make it shorter
        };
        Integer [] arr2 = {1,2,3,4,5};
        System.out.println(contains2.test(arr2, 56));


        System.out.println("---------------------------");

        //anagram -  two words have same amount of characters (not necessarily in the same order)
        // listen and silent

        BiPredicate<String, String> isAnagram = (str1,str2)-> {

            char[] arrOne = str1.toCharArray();  // ['l' 'i' 's' 't' 'e' 'n'] -- > here im converting a String into a char Array
            char [] arrTwo = str2.toCharArray(); // ['s' 'i' 'l' 'e' 'n' 't']
            Arrays.sort(arrOne);  // here im utilizing the method .sort to make it in alphabetic order this will help me later on to compare if the characters are the exact same ones
            Arrays.sort(arrTwo);   // here im utilizing the method .sort to make it in alphabetic order this will help me later on to compare if the characters are the exact same ones

           return Arrays.equals(arrOne,arrTwo); // here im using the method .equals from Arrays to compare if they have the exact same characters

        };

        System.out.println(isAnagram.test("listen", "silent")); // true --> i have to put it into a print statement bc the return type is boolean


    }
}

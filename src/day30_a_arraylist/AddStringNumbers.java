package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers {

    public static ArrayList<Integer> sumFromString (ArrayList <String> numsToSum){ //  “123”, “34”, “513”

        ArrayList <Integer> sums = new ArrayList<>();


        for ( String each : numsToSum) {

            int sumOfEach = 0;
            for ( String eachLetter : each.split("")){ //["1", "2", "3"]
                sumOfEach += Integer.parseInt(eachLetter); // "1" --- >  1
            }
            sums.add(sumOfEach);
        }
        return sums;
    }

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>(Arrays.asList( "123", "34", "513"));
        ArrayList <Integer>  summedVersion = sumFromString(list);
        System.out.println(summedVersion);
        System.out.println( sumFromString(list) );

    }



}

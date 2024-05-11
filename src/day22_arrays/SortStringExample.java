package day22_arrays;

import java.util.Arrays;

public class SortStringExample {
    public static void main(String[] args) {
        String [] arr = {" java" , "Hello", "$Dollar", "Zelle", "soft skills","4four", "6Six","Hi", "SIX"}; // when sorting an String array it goes in ascending way based on ASCII table

        // Special chars(including space) > numbers > uppercase (A-Z) >lowercase (a-z)

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //  [ java, $Dollar, 4four, 6Six, Hello, Hi, SIX, Zelle]

    }
}

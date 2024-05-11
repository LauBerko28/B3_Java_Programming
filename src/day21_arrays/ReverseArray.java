package day21_arrays;
/*
    Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
        [1, 2, 3, 4, 5]
    Output:
        [5, 4, 3, 2, 1]

 */

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        int [] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length-1 - i] = arr[i]; // 4 - 0  | 4 - 1 | 4 - 2 | 4 - 3 | 4 - 4
        }


        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reversed));



    }
}

package day25_methods;

import java.util.Arrays;

public class MinNumberInArray {


    public static void main(String[] args) {
        int [] arr = {12, 43, 12, 7, 34, 234, 543};
        System.out.println(minNumInSortedArray(arr));

        System.out.println(minNumInArray(arr));
    }

    public static int minNumInSortedArray (int [] arr) {
        Arrays.sort(arr);

        return arr[0];
    }

    public static int minNumInArray (int [] arr) {

        int min = arr [0];
        for (int eachNum : arr){
            if (eachNum < min){
                min = eachNum;
            }
        }
        return min;
    }
}

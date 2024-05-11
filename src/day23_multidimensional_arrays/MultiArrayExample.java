package day23_multidimensional_arrays;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {
        int[] n = {5, 10, 20, 10};  // SINGLE dimensional array
        int[] m = {5, 10, 100, 39, 19}; // SINGLE dimmensional array

        int[][] all = {n, m}; //--> here im storing an array inside another array
        System.out.println(all); // the result will give me a hashcode/memory location for each SINGLE array
        System.out.println(Arrays.toString(all)); // this will print hashcode as dor a multidimenssional array i have to use .deepToString
        System.out.println(Arrays.deepToString(all));  // [[5, 10, 20, 10], [5, 10, 100, 39, 19]]

        System.out.println();

        int[][] multi = {                   // here i have 4 single arrays
                {90, 80, 70},               // SINGLE ARRAY at 2D array index of 0
                {19, 324, 5646, 23},        // SINGLE ARRAY at 2D array index of 1
                {234, 324},                 // SINGLE ARRAY at 2D array index of 2
                {65}                        // SINGLE ARRAY at 2D array index of 3
        };

        System.out.println(multi.length);    // 4 --> how big is my array
        System.out.println(multi[0].length); // 3 --> my array started from the index of 0
        System.out.println(multi[1].length); // 4 --> my array started from the index of 0
        System.out.println(multi[2].length); // 2 --> my array started from the index of 0
        System.out.println(multi[3].length); // 1 --> my array started from the index of 0

        System.out.println();
        System.out.println(multi[1][2]); // 5646
        // System.out.println(multi[3][1]); // out of bounds because i dont have this space in this array

        System.out.println(multi[1]); // will give me a hashcode because i cannot print an array like this
        System.out.println(Arrays.toString(multi[1])); // telling it to print the array at the location of 1
    }
}

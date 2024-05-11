package day22_arrays;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int [] nums = {2, 23, 56, 2, 45, -2, 555};
        int [] notSorted = nums; // here I did not create a new array object, i just point to what the num is
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(notSorted));

        System.out.println();
        Arrays.sort(nums); // sortest from the smallest to the biggest - ascending order-
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(notSorted));

        //Max and Min
        System.out.println("Min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length-1]);

        // Here we made a new arrays and took the values form nums and assigned to num3 array
        int [] num3 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            num3[i] = nums[i];
        }
    }
}

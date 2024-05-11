package day21_arrays;
/*

    declare and assign an array of numbers

        {3, 6, 10}

    sum all the numbers in the array

 */

public class SumUpElements {
    public static void main(String[] args) {
        int [] nums = {3, 6, 10};
        System.out.println("Total: " + (nums[0] + nums[1] + nums[2])); // this will print Total: 3610


        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // sum = sum  + nums[i];
        }

        System.out.println("Total: " + sum);


    }
}

package day22_arrays;

/*
        declare and assign an array

        500, 120, -80, 90, 250, - 10

        find the biggest number in the array

        find the smallest number in the array
 */


public class MaxMin {
    public static void main(String[] args) {

        int [] nums = {500, 120, -80, 90, 250, - 10};
        int max = nums[0];
        int min = nums[0];

        /* FEYRUZ WAY!
        int max = Integer.MIN_VALUE; // This way you can also get what the MIN value that int can hold -- > -2147483648
        int min = Integer.MAX_VALUE; // This way you can also get what the MAX value that int can hold -- > 2147483647


        int max = Integer.MIN_VALUE;    // nums[0];
        int min = Integer.MAX_VALUE;    // nums[0];
        */

 // LAU'S WAY
        for ( int each : nums){

            if (max < each){
                max = each;
            }
            if (min > each){
                min = each;
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}

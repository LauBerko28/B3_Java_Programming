package day23_multidimensional_arrays;

import java.util.Arrays;

public class AverageOfEachTraditional {
    public static void main(String[] args) {

        int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };


        double totalSum = 0;
        int totalElem = 0;

        // OUTER LOOP will get each single dimensional array

        for (int i = 0; i < nums.length; i++) {

            double sum = 0;

            // INNER LOOP will get each element in SINGLE DIMENSIONAL array
            for (int j = 0; j < nums[i].length; j++) {


                sum += nums[i][j];   // nums[0][3]
                //totalSum += eachElem;

            }
            totalSum += sum;
            totalElem += nums[i].length;

            System.out.println("Average of : " + Arrays.toString(nums[i]) + ": ----- " + sum / nums[i].length );

        }
        System.out.println();
        System.out.println("2D array average: " + totalSum / totalElem);


    }
}

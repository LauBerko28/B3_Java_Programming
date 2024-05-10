package day23_multidimensional_arrays;
/*
            Given a 2D array find the average of each inner array
            and extra: average of the whole array

            Ex:

                3, 4, 5, 6
                5, 2, 6
                10, 20, 30
 */

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {
        int [] [] nums = {
                {3,4,5,6},
                {5,2,6},
                {10,20,30}
        };

        double totalSum = 0;
        int totalElem = 0;

        // OUTTER LOOP will get each single dimensional array
for (int [] eachSingleArray  :nums){ // here im looping through the 2d array
    double sum = 0 ; // because the task is asking me for average i need to add them up
    // do this in here as i want the loop to re-start after everycycle

    // INNER LOOP will get each element in SINGLE DIMENSIONAL array
    for (int eachElement : eachSingleArray){
        sum += eachElement;

    }
    System.out.println("Average of: " + Arrays.toString(eachSingleArray) + ": ---- " + sum/eachSingleArray.length);
    // do it like this because im finding the average of each single array
    totalSum += sum;
    totalElem += eachSingleArray.length;

    System.out.println("Average of : " + Arrays.toString(eachSingleArray) + ": ----- " + sum / eachSingleArray.length );

}
        System.out.println();
        System.out.println("2D array average: " + totalSum / totalElem);

}
    }
}

package my_utilities;

import java.util.Arrays;

public class ArrayUtil {

    /**
     * This method returns the minimum number from Array using sorted method
     * @param arr is the parameter that accepts Array
     * @return the minimum number among all the numbers from Array
     */

    public static int minNumInSortedArray (int [] arr) {
        Arrays.sort(arr);

        return arr[0];
    }

    /**
     * This method returns the minimum number from Array for each sorted method
     * @param arr is the parameter that accepts Array
     * @return the minimum number among all the numbers from Array
     */
    public static int minNumInArray (int [] arr) {

        int min = arr [0];
        for (int eachNum : arr){
            if (eachNum < min){
                min = eachNum;
            }
        }
        return min;
    }

    /**
     * This method returns the max number from Array using sorted method
     * @param arr is the parameter that accepts Array
     * @return the max number among all the numbers from Array
     */

    public static int maxNumInSortedArray (int [] arr) {
        Arrays.sort(arr);

        return arr[arr.length-1];
    }

    /**
     * This method returns the minimum number from Array for each sorted method
     * @param arr is the parameter that accepts Array
     * @return the minimum number among all the numbers from Array
     */
    public static int maxNumInArray (int [] arr) {

        int max = arr [0];
        for (int eachNum : arr){
            if (eachNum > max){
                max = eachNum;
            }
        }
        return max;
    }

    /**
     * this method checks if the given number exists in the Array
     * @param arr is the given array to be checked
     * @param num is the given number to check if it exists in array
     * @return if given nums exists in array or not
     */
    public static boolean contains (int []arr ,  int num){

        // boolean result = false;
        for (  int eachNum : arr){
            if (eachNum == num){
                return true;
                // break;
            }
        }
        return false;
    }
}

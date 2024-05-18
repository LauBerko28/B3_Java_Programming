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

    /**
     * This method returns new array with added elements at the end
     * @param origArr is an array where we will add an element to the end
     * @param num is the element we will add to the end
     * @return new array with the added element
     */
    public static int [] addElemInArray ( int [] origArr , int num ){

        int [] newArr = Arrays.copyOf(origArr, origArr.length+1);
        //  {1,2,3,_}
        newArr [newArr.length-1] = num;

        return null;
    }

    /**
     * This method returns a new array with combined elements from 2 int arrays
     * @param array1 is where we will add an element to the beginning
     * @param array2 is an array where we will add an element to the  end
     * @return new array with combined elements
     */

    public static int [] addElemInArray (int [] array1 , int [] array2){ // [0, 1, 1, 2, 3] - [4, 5]


        int [] combinedArr = Arrays.copyOf(array1, array1.length + array2.length); // [0, 1, 1, 2, 3, _, _]

        for (int i = array1.length; i < combinedArr.length; i++) {
            //    bc i want my starting point from the end of the first array

            combinedArr [i] =  array2 [i-array1.length]; // newArr[5] = arr2[5 - 5]; |  newArr[6] = arr2[6 - 5]

        }

        return combinedArr;
    }

    /**
     * This method finds first matched element's index of int array
     * @param arr is the parameter where we will check for the element
     * @param num is the parameter where we will check if there is a match to it
     * @return the index if there is a match and -1 if there is no match
     */
    public static int indexOf (int [] arr , int num) {

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] == num ){
                return i; // with this one im looping to find a matching case
            }
        }

        return -1; // think about when you do an indexOf in String and there is not a matching case then java will return -1
    }

    /**
     * This method finds first matched element's index of String array
     * @param word is the parameter where we will check for the element
     * @param word is the parameter where we will check if there is a match to it
     * @return the index if there is a match and -1 if there is no match
     */

    public static int indexOf (String [] array, String word){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(word)){
                return i;
            }
        }
        return -1;
    }

    /**
     * This method sums up all the elements in int
     * @param nums  is the array where I get all the elements to sup up
     * @return the total of the all elements summed up.
     */

    public static int sum (int ... nums) {
        int sum = 0;
        for ( int eachNum :nums){
            sum += eachNum;
        }
        return sum;
    }

    //TODO: create a reusable method with 2 arrays that accepts String
}

package day23_multidimensional_arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int [] arr = {4,10,30,100, 50};

        // this methoid is to find the index of something and it must be sorted

        System.out.println(Arrays.binarySearch(arr,4)); // the result will give me the index of the number
        System.out.println(Arrays.binarySearch(arr,100)); // this number is at the index of 3
        System.out.println(Arrays.binarySearch(arr,50)); // -5
        System.out.println(Arrays.binarySearch(arr,200)); // as this method always has to be sorted in order to work, and if this number does not belong to the Array it locates it where it should be, and because is not there it mulpiplies it by -1

        // if i need to use it then first i have to

        Arrays.sort(arr);

        // We can write a code check for the first matched / found index
        int num = -4;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {
                System.out.println("Your first matched index: " + i);
                break;
            } else {
                count++;
                //System.out.println("There was no match");
            }

        }
        if (count == arr.length) {
            System.out.println("There was no match");
        }

    }
}

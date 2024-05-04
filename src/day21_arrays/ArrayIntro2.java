package day21_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {
        double [] arr = new double[4]; // hey you have a container double type and you have assigned 4 spots for it to hold
        //                         must add how big it is thats why i need the number inside the []

        System.out.println(Arrays.toString(arr)); // im only switcghing it to string for printing purposes, but im not re-assigning the array to a String
        System.out.println(arr.length); // 4 --> how many containers do i have inside my basket

        arr [0] = 30.99; // here im assigning the value of 30.99 to the container at index of 0 in the array
        System.out.println(Arrays.toString(arr)); // only for printing purposes i convert the Arrays to a string

        double price = 1.99; // im assigning the value of the second container
        int quantity = 5; // this is only for operational purposes like shown below

        arr [1] = price * quantity; // here im saying the value for array space 1 is calculated by the price and the quantity of object
        System.out.println(Arrays.toString(arr)); // this is only for operational purposes like shown below

        arr [2] = 10.99;
        arr [3] = 50; // --> eventhough im giving an int and due to the Array type being double and double is bigger than int, then it'll cast to a double so when it prints is now 50.0

        System.out.println(Arrays.toString(arr));

        // System.out.println(arr[4]); -->  the last index is 3 - ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4

        arr = new double [5]; // I created a new array with size 5 ~~ i can re-assign the variables/values
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr.length); // 5 --> arrive size
        int arrSize = arr.length; // i can assign it to an int variable because the result of the length gives me a number (int)
        System.out.println(arrSize);






    }
}

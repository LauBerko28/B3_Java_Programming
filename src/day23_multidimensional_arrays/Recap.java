package day23_multidimensional_arrays;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {

        int [] arr = {30,90,60,360,180};
        int [] arr2 = {180,360,30,90,60};


        // how can i print out arrays
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println("compare before sorting: " + Arrays.equals(arr,arr2)); // what is inside the () is an argument

        // sorting on ascending order
        Arrays.sort(arr);
        Arrays.sort(arr2);

        // compare element of arrays
        System.out.println("compare after sorting: "+Arrays.equals(arr,arr2));

        // how to join the elements of Array
        String [] words = {"java", "selenium" , "api", "db"};
        System.out.println(String.join("**",words));

        // how to convert a String into String array --> by using split
        String str = "Today is thursday"; // ----> str.toCharArray(); --> ['t' , 'o', 'd', ....]
        System.out.println(str.split(" ")); // [Ljava.lang.String;@3d24753a because i cannot print an array directly
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(str.toCharArray()); // EXCEPTION= this will print as a whole string
        System.out.println(Arrays.toString(str.toCharArray())); // each character will become one element in the array





    }
}

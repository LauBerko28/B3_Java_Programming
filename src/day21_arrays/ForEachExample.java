package day21_arrays;

import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        //The below are the other options for Array declaration.
       // int [] nums = new int[]{3,4,5,7}; // since we have curly brackets with values, in [] we do not need size
       // int [] nums = new int[4]; // // since we DO NOT have curly brackets with values,  in [] we do HAVE TO have size

        int [] nums = {3,4,5,7};

        // this is with traditional loop or fori loop
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Traditional loop: "+nums[i]);   // here im only checking each index of the Array
        }

        //    dataTypes of the elements of the array   :              what im looping through this array
        for (int eachElem                              :              nums){
            System.out.println("For each loop: "+eachElem); // here it prints each character
        }

        System.out.println();
        String [] classes = {"java","softskills", "selenium", "database", "api"};
        for (String each : classes){
            System.out.println(each);
        }

        for (int i = 0; i < classes.length; i++) {
            System.out.println("Traditional loop: " + classes[i]);
        }
        System.out.println();
        double [] nums2 = {23, 43, 34, 2};
        for (double each : nums2) {
            System.out.println("Foreac: " + each);
        }

        System.out.println();
        for (int i = 0; i < nums2.length; i++) {
            System.out.println("Fori: " + nums2[i]);

        }


         // if i wnt to write an element and printing it i can use a foreach, but if any modifications need to be made or characters need to be printed, then i must use a fori/do while or while Loop

        // The difference between fori and foreach loop when to use.
        String [] names = new String[4];

        for ( String each : names) { // [null, null, null, null] --> every cycle each = null because i cannot re-assin anything
            System.out.println(each); //here im  getting each element from array and re-print
            each = "Test"; // here we re-assign a "Test" to variable called each
            System.out.println(each); // Here we print the latest value of variable each
        }
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++) { // here i can manipulate/add value of the array
            names[i] = "Test";
        }
        System.out.println(Arrays.toString(names));






    }
}

package day27_wrapper_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListExample {

    public static void main(String[] args) {
      //  ArrayList<int> numbers = new ArrayList<>(); // ArrayList does not accept primitive dataTypes that is why I cannot use int directly

        ArrayList <Integer> numbers = new ArrayList<>(); // At this line in my arrayList there is NO element.
        //                                                  It preserved location for 10 *** because by default it takes the space ofr 10, but it can take more or less
        System.out.println(numbers);
        System.out.println(numbers.size()); // Eventhough the default capacity is 10, the default cap
/*
        int [] nums = {1, 2, 3, 4};
        System.out.println((Arrays.toString(nums));
         // add/assign to Array --- >  num[2] = 45;
        nums[2] = 45;
        System.out.println(Arrays.toString(nums)); // [1, 2, 45, 4]

       */

        // add/assign to ArrayList
        numbers.add(40); // here i added 40 to the end of the array list - because it is flexible i dont need to re-assign it it'll continue adding to the original ArrayList and will add it to the end of the Array
        System.out.println(numbers);
        numbers.add(-40); // added -40 to the end of the ArrayList **** the output is [40, -40]
        System.out.println("numbers = " + numbers);

        numbers.add(50);
        numbers.add(60);
        System.out.println(numbers);   // [40,-40,50,60]


        // In Array how do we access each element (with the Index)
        // numbers[1];
        System.out.println(numbers.get(0)); // 40
        System.out.println(numbers.get(1)); // -40
        System.out.println(numbers.get(2));  // 50
        System.out.println(numbers.get(3)); //60
        // System.out.println(numbers.get(4)); will give me an IndexOutofbounds

        //How do we know the number of total elements in ArrayList
        //Array ---> nums.length

        System.out.println(numbers.size()); // this will give me the amount of elements on the ArrayList


        // if i

        // Reviewing the CONVERSION
        Integer a = numbers.get(0) ; // Integer
        int b =  numbers.get(0) ;  // Integer -- > int  --- > UNBOXING


        int c = numbers.size(); // int = int
        Integer d =  numbers.get(0) ; // int --- >  Integer ---- > AUTOBOXING






    }
}

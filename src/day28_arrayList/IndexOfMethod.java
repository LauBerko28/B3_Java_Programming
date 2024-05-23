package day28_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class IndexOfMethod {
    public static void main(String[] args) {
        // returns the index of the first occurrence of element in this list, when it doesnt exist it retuns -1
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(100);
        nums.add(500);
        nums.add(800);
        nums.add(100);
        System.out.println(nums); //[100, 200, 100, 500, 800, 100]

        // finds the index of the first match
        System.out.println(  nums.indexOf(100)  ); // 0 --> because my first match of element 100 is at the index of zero 0

        System.out.println(nums.indexOf(400)); // -1 --> because there is not a matching case

        int index = nums.indexOf(500); // i can assign it to int because it'll return me a number
        System.out.println(index); // 3 --> this is the location where 500 is stored at

        System.out.println( nums.lastIndexOf(100)); // 5 --> checks for the last matching case so it starts checking it from the back
        nums.remove(nums.lastIndexOf(100)); // here i removed by index
        System.out.println(nums); // [100, 200, 100, 500, 800]

        // hey can you update last 100 to be -100
        nums.set(nums.lastIndexOf(100),-100);
        System.out.println(nums); // [100, 200, -100, 500, 800]


        int []  arr2 = {1, 2, 3};

        //ArrayList <Integer> l5 = new ArrayList<>(  Arrays.asList(  arr2   ) );
        ArrayList <Integer> l5 = new ArrayList<>(  Arrays.asList(  converIntToIntegerArr(arr2)   ) );


    }


    public static Integer []  converIntToIntegerArr (int [] arr) {

        Integer [] objArr = new Integer[arr.length];

        for (int i = 0; i <arr.length; i++) {

            objArr[i] = arr [i];

        }

        return objArr;


    }
}

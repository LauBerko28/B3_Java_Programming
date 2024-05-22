package day27_wrapper_arraylist;

import java.util.ArrayList;

public class ClearMethod {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();
        System.out.println(nums); // []
        System.out.println(nums.size()); // 0
        System.out.println(nums.isEmpty()); // true
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);
        nums.add(500);
        System.out.println(nums); // [100, 200, 300, 400, 500]
        System.out.println(nums.size()); // 5 -- how many elements i have
        System.out.println(nums.isEmpty()); // false

        System.out.println("Now i clear"); // Now i clear
        nums.clear(); //  return --> [] deleting all the data I have inside the ArraylIST
        System.out.println(nums); // []
        System.out.println(nums.size()); // 0
        System.out.println(nums.isEmpty()); // true



    }
}

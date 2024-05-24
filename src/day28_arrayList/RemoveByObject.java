package day28_arrayList;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(400);
        nums.add(500);
        nums.add(1);
        nums.add(600);
        nums.add(700);
        System.out.println(nums); // [100, 200, 1, 400, 500, 1, 600, 700]

        nums.remove(1); // here i remove the number at the location of 1 --> here it takes it as a primitive dataType
        System.out.println(nums); // [100, 1, 400, 500, 1, 600, 700]

        Integer elem = 1; // here i converted  an element int into an object Type Integer
        nums.remove(elem); // here i remove the first match
        System.out.println(nums); // --> [100, 400, 500, 1, 600, 700] --> here i deleted the element 1 not the index

        // nums.remove(500); IndexOutOfBoundsException
        nums.remove((Integer)500); // Removing by OBJECT **** here im doing casting to Integer to remove the element 500
        System.out.println(nums); // [100, 400, 1, 600, 700]

        nums.remove(Integer.valueOf("600")); // Removing by OBJECT --> valueOf converted the String into a wraperclass
        System.out.println(nums); // [100, 400, 1, 700]
    }
}

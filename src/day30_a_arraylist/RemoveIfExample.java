package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {


        ArrayList <Integer> base = new ArrayList<>(Arrays.asList(4, 6, 2, 5, 12, 9, 143, 4, 7, 8, 2));
        System.out.println(base); // [4, 6, 2, 5, 12, 9, 143, 4, 7, 8, 2]

        ArrayList <Integer> nums = new ArrayList<>(base); // created a new arrayList that containes the same values as base
        // from this list i want to remove the even numbers
        // first cycle  4, 6, 2, 5, 12, 9, 143, 4, 7, 8, 2
        // second cycle  6, 2, 5, 12, 9, 143, 4, 7, 8, 2


//        for (Integer each :nums) // the purpose of this for each is to get each element
//            if (each% 2 == 0){
//                nums.remove(each); // but if start removing the elements at some point i will get out of elements to check therefore will get OutOfBounds
//            }


        // PREDICATE = checks a condition if true remove a condition
        nums.removeIf(each -> each % 2 == 0); // it goes and takes each elem from the arrayList and then check the condition, if true then remove it from arrayList
        System.out.println(nums); // [5, 9, 143, 7]

        ArrayList <Integer> nums2 = new ArrayList<>(base);
        nums2.removeIf(n -> n >= 10);
        System.out.println(nums2); // [4, 6, 2, 5, 9, 4, 7, 8, 2]


        ArrayList <Integer> nums3 = new ArrayList<>(base);
        nums3.replaceAll(e -> e*2);
        System.out.println(nums3); // [8, 12, 4, 10, 24, 18, 286, 8, 14, 16, 4]

    }
}

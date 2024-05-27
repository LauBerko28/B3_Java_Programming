package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BadPairs {

    public static ArrayList <Integer> goodPairs (ArrayList <Integer> list){ // (3, 5, 2, 64, 23, 1234, 76, 23, 45, 2)
        ArrayList <Integer> goodList = new ArrayList<>();

        for (int i = 0; i < list.size(); i+=2) {

            if (list.get(i)  < list.get(i+1)){ // hey go take the first num and compare it with the second one, if the first element is smaller then add it to the good list
                goodList.add(list.get(i));
                goodList.add(list.get(i + 1));
            }

        }
        return goodList;
    }

    public static void main(String[] args) {
        ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(3, 5, 2, 64, 23, 1234, 76, 23, 45, 2));

        // bad pair --> i > i+1
        // good pair --> i <= i+1 (3, 5, 2, 64, 23, 1234)
        System.out.println(nums); // [3, 5, 2, 64, 23, 1234, 76, 23, 45, 2]
        System.out.println(goodPairs(nums)); // [3, 5, 2, 64, 23, 1234]


    }
}

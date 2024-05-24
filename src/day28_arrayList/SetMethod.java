package day28_arrayList;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);
        System.out.println(nums); // [100, 200, 500, 800]

        nums.set(0,-100); // hey go and update the element aat the index of # (in this case index of 0) THIS ONE DOES NOT ADD ONLY UPDATES
        System.out.println(nums); //[-100, 200, 500, 800]

       // nums.set(5,400); IndexOutOfBoundsException
        nums.set(nums.size()-1,-900);
        System.out.println(nums); // [-100, 200, 500, -900] here i just replaced the element at the last index for -900

        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("softskills");
        list.add("api");
        list.add("database");
        System.out.println(list); // [java, softskills, api, database]
        list.set(1,"selenium");
        System.out.println(list); // [java, selenium, api, database]
    }
}

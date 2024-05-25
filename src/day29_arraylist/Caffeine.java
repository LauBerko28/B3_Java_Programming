package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {

        // 1st  way of creating an arrayList : by adding one by one
        ArrayList <String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("energy drink");
        drinks.add("soda");
        System.out.println(drinks); // [coffee, tea, energy drink, soda]

        ArrayList <String> drinks2 = new ArrayList<>(drinks); // we created a NEW array list by copying another array list
        System.out.println(drinks2); // [coffee, tea, energy drink, soda]

        // 3rd way of creating an arrayList: by converting the elements to an Arrays.asList with help of var args
        String [] allDriks = {"coffee", "tea", "energy drinks", "soda"};
        // ArrayList <String> drinks3 = new ArrayList<>(allDriks); --> not VALID because it needs to be a Collection type
        ArrayList <String> drinks3 = new ArrayList<>(Arrays.asList(allDriks)); // --> here i used var args
        System.out.println(drinks3); // [coffee, tea, energy drink, soda]


        // 4th way of creating an arrayList:
        ArrayList <String> drinks4 = new ArrayList<>(Arrays.asList("coffee", "tea", "energy drinks", "soda")); // --> this is also with var args
        System.out.println("drinks4 = " + drinks4); //drinks4 =  [coffee, tea, energy drink, soda]

        //5th way of creating an arrayList: by bulk (adding multiple things at once
        ArrayList <String> drinks5 = new ArrayList<>();
        // drinks5.addAll("coffee", "tea", "energy drinks", "soda") --> nOT VALID

        drinks5.addAll(Arrays.asList(allDriks)); // here im adding as a collection type
        System.out.println("drinks5 = " + drinks5); // drinks5 = [coffee, tea, energy drinks, soda]

        //6th way of creating an arrayList: by bulk (adding multiple things at once
        ArrayList <String> drinks6 = new ArrayList<>();
        drinks6.addAll(Arrays.asList("coffee", "tea", "energy drinks", "soda"));
        drinks6.add("test1");
        System.out.println(drinks6); // [coffee, tea, energy drinks, soda, test1]
        drinks6.addAll(Arrays.asList("test2", "test3")); // [coffee, tea, energy drinks, soda, test1, test2, test3]
        System.out.println(drinks6);


        drinks6.addAll(0, Arrays.asList("check1", "check2")); // --> added starting from certain index
        System.out.println(drinks6); // [check1, check2, coffee, tea, energy drinks, soda, test1, test2, test3]


    }
}

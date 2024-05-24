package day29_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.SplittableRandom;

public class JobTitles {
    public static void main(String[] args) {

        ArrayList <String> allJobs = new ArrayList<>();
        // addAll();
        allJobs.addAll(Arrays.asList("SDET", "Developer", "PO", "CEO", "DevOps", "QA", "QE", "BA", "Dr", "PO"));
        System.out.println("Original: " + allJobs); // Original: [SDET, Developer, PO, CEO, DevOps, QA, QE, BA, Dr]

        //removeAll()
        ArrayList<String> jobs1 = new ArrayList<>(allJobs); // created new array list including my original one
        jobs1.removeAll(Arrays.asList("PO", "QA", "QE", "BA")); // anything inside the parenthesis still has to be collection type
        System.out.println("After 1st remove: " + jobs1); // After 1st remove: [SDET, Developer, CEO, DevOps, Dr] --> it will remove all matching cases and order is not relevant

        //retainAll();
        ArrayList<String> jobs2 = new ArrayList<>(allJobs);
        jobs2.retainAll(Arrays.asList("SDET", "Developer", "PO")); // --> basically says keep only this and remove the rest of the elements
        System.out.println("after Retain " + jobs2); // after Retain [SDET, Developer, PO, PO]


        // containsAll();
        ArrayList<String> jobs3 = new ArrayList<>(allJobs);
        System.out.println(jobs3.containsAll(Arrays.asList("Developer", "Dr"))); //true --> returns me a boolean
        System.out.println(jobs3.containsAll(Arrays.asList("Police", "Dr"))); //False --> as long as there is one mismatch you will not get TRUE


    }
}

package day42_a_collection.set;

import java.util.*;

public class SetObjects {
    public static void main(String[] args) {
        //IQ: What's the difference between List and Set?
          // A: list= allows duplicates - Set Does not allow duplicates

        //SET --> Think about SSN# people cannot have duplicate ID#, is unique to each person
        // if i dont want to have duplicates and want it to print in order I'll use
        // Collection allows us to manipulate the data the way we want

        //Hash doesnt keep insertion order + NO DUPLICATES
        Set<String> set = new HashSet<>(); // reference of the interface Set, but the object side it LinkedHashSet<>()
        set.add(null); // null is also accepted ** it has access to .add method because it comes all the way from collection
        set.add("hello");
        set.add("$14.5");
        set.add("400");
        set.add("hello"); // Set interface does not allow duplicates, that is why it can only store one "hello"
        set.add("%");
        System.out.println(set);  // [null, 400, %, hello, $14.5]

        // ONLY DIFFERENCE BETWEEN THESE 2 -->  LinkedHashSet<>() INSERTION ORDER IS KEPT
        //Linked does keep insertion order + NO DUPLICATES
        Set<String> set2 = new LinkedHashSet<>();  // reference of the interface Set, but the object side it LinkedHashSet<>()
        set2.add(null); // null is also accepted ** it has access to .add method because it comes all the way from collection
        set2.add("hello");
        set2.add("$14.5");
        set2.add("400");
        set2.add("hello"); // Set interface does not allow duplicates, that is why it can only store one "hello"
        set2.add("%");
        System.out.println(set2);  // [null, hello, $14.5, 400, %]

        System.out.println("--------------");

        // Sorts the insertion order
        Set<String> set3 = new TreeSet<>() {
        };  // reference of the interface Set, but the object side it TreeSet<>()
        // set3.add(null); null is NOT accepted NullPointerException
        set3.add("hello");
        set3.add("$14.5");
        set3.add("400");
        set3.add("hello"); // Set interface does not allow duplicates, that is why it can only store one "hello"
        set3.add("%");
        set3.add("APPLE");
        System.out.println(set3);  // [$14.5, %, 400, APPLE, hello]  --> it sorts it by the order of characters in Java




    }
}

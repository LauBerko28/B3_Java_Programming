package day41_collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

// collection itself is an interface
public class ListObjects {
    public static void main(String[] args) {

        // first im going to create an array, i can create it with reference to itself, collection and l==ist
        // ArrayList works with arrays in the background
        // LinkedList works with nods in the background
        // Vectors is an older version of the array list, is synchronized = thread-safe (you cannot access the elements at the same time from multiple threads-


        List <String> list = new ArrayList<>(); // reference of the interface list, but the object is ArrayList
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(null); // I can add null because it is the default value of the dataType of the Array
        list.add("a"); // this is ok because i can hold duplicate values
        System.out.println(list); //insertion order is kept
        System.out.println(list.get(3)); // here im getting the element at the index of 3

        System.out.println("----------------");


        List <String> list2 = new LinkedList<>(); // reference of the interface list, but the object is LinkedList
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add(null); // I can add null because it is the default value of the dataType of the Array
        list2.add("a"); // this is ok because i can hold duplicate values
        System.out.println(list2); //insertion order is kept
        System.out.println(list2.get(3)); // here im getting the element at the index of 3


        Vector<String> list3 = new Vector<>(); // reference of the interface list, but the object is LinkedList
        list3.add("a");
        list3.add("b");
        list3.add("c");
        list3.add("d");
        list3.add(null); // I can add null because it is the default value of the dataType of the Array
        list3.add("a"); // this is ok because i can hold duplicate values
        System.out.println(list3); //insertion order is kept
        System.out.println(list3.get(3)); // here im getting the element at the index of 3



    }
}

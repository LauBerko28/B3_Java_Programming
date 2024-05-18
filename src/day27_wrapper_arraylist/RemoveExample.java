package day27_wrapper_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // i can not do char because is not object type, but i can do Character

        System.out.println(list.size()); // the output here is 0 because i dont yet have anything in it

        // lets add some data in it
        list.add("water");  // [water]
        // list.add(3) // invalid because the datatyoe of my arraylist is String
        list.add("bread"); // [water, bread]
        list.add("juice"); // [water, bread, juice]
        list.add("fruit"); // [water, bread, juice, fruit]
        System.out.println(list); // [water, bread, juice, fruit]

        list.add(1,"rice"); // what i did here was adding an element on the index of 1 and then all the elements move to the right
        //                                  is an overloaded version of the add method
        //                                   [water, rice, bread, juice, fruit]
        System.out.println(list);
        list.remove(0);
        System.out.println(list); // [rice, bread, juice, fruit]

        System.out.println("list.remove(0) = " + list.remove(0)); // list.remove(0) = rice it returns me the element that was removed
        System.out.println(list); // [bread, juice, fruit]

        // remove the last one.
        System.out.println(list.remove(list.size() - 1)); // here im saying im removing element [fruit]
        System.out.println(list); // my updated list [bread, juice]

        // System.out.println(list.remove(12)); IndexOutOfBoundsException


        // if i want to remove by the element do this
        list.remove("juice"); // here if the element exist the return will be TRUE, if the element does not exist will return false
        System.out.println(list); // [bread]

        System.out.println(list.remove("water")); // returns FALSE since there is not a match

        list.add("banana"); // [bread, banana]
        list.add("banana"); // [bread, banana, banana]
        System.out.println(list);// [bread, banana, banana]

        list.remove("banana");  // [bread, banana] if the element exist multiple times it will remove the first match




    }
}

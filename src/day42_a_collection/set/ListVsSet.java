package day42_a_collection.set;

import java.util.*;

public class ListVsSet {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(); // When I have ArrayList it has indexes and it works with arrays in the background
        // DUPLICATES ARE OK, INSERTION ORDER IS KEPT
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        list.add(4);
        System.out.println(list); //[4, 10, 1, 2, -5, 10, 4]
        System.out.println(list.get(0)); // 4 --> Since it works with indexes, I can get the elements like this.
        System.out.println(list.size() - 1); //6

        Set<Integer> set = new HashSet<>(); // remember hashset does not allow duplicates
        // DUPLICATES ARE NOT OK, INSERTION ORDER IS NOT KEPT
        set.add(4);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10);
        set.add(4);
        System.out.println(set); //[1, 2, 4, -5, 10]
        System.out.println(set.size() - 1); //6

        //SINCE SET DOES NOT HAVE INDEXES WE CANNOT GET THE ELEMENTS IN THIS WAY
        //System.out.println(set.get(0));
        //System.out.println(set.get(set.size()-1));

        //Q: How can we get the elements?
        //A: We can loop throuhh Set and get the element. Lets say, we want to get the element 6


        for (Integer each : list){
            if(each == -5){ // this will work because set does not allow duplicates so the value will be unique always
                System.out.println(each);
            }
        }

        for (Integer each : list){
            System.out.println(each);
        }

        // Q: How can I sort my HashSet
        // A: Use TreeSet class as it does sort it

        Set<Integer> sortedSet = new TreeSet<>(set); // Im making a new data Structure
        System.out.println(sortedSet); // [-5, 1, 2, 4, 10]


        //Q: Remove duplicates from list - sort (if i also want to sort i can use TreeSet)
        // if lets say i want to remove the duplicates, I already know that the Set interfaces dont allow duplicates, then i use them
        //here i dont want to assign it only accept it

        System.out.println(list);
        System.out.println(new LinkedHashSet<>(list)); // [4, 10, 1, 2, -5]

        // Q: You have an array of int: Remove Duplicates and sort them
        Integer [] a = {2, 4, 23, 76, 2, 345, 2, 8, 4, -3, 2, -35};
        // ArrayList<Integer> l = Arrays.asList(a);
        // Set <Integer> s = new TreeSet<>(Arrays.asList(a));
        System.out.println(  new TreeSet(Arrays.asList(a))  ); // Arrays.asList(a) --> here i converted the array into a list which is a collection type and once is this way i can
        // [-35, -3, 2, 4, 8, 23, 76, 345]

        String s = "aaaabbbccccdddddeeee"; // to be able to use this into collection I have to convert this into array
        System.out.println( new HashSet<> (Arrays.asList(s.split(""))).toString().replace("[","").replace("]","").replace(", ","") ); // Arrays.asList --> make it into the collection type // new HasSet removes the duplicates

        // abcde

        /*
        Above we converted String into an array
        then we converted String array into List of String
        then we converted List of String into Set of String - which removed duplicates
        then we did String manipulation to remove "[", "]" and ", " and printed it
         */






    }
}

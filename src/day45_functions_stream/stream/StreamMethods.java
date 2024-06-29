package day45_functions_stream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {

        // This is juts method chaining

        // How do we create stream - since it is not a Class or data structure? - we call the .stream method
        // It is a method which works with Data Structure. It has access to other useful methods which we can "CHAIN" together


        //We will use it for "array" and "arrayList". -but you can use it with any Collection

        // #1 - USING STREAM WITH ARRAY
        int [] arr = {1,2,3,4,5}; // here im declaring an int array
        //In order to create a stream for "array", array itself does not have a method that we can use.
        // Therefore, we use the Arrays class which has methods that work with array
        // first we call our Arrays class
        // then we call the .stream method
        // last we pass our arr as the argument


        Arrays.stream(arr); // Here we just had access to use stream() with array (we converted our array into stream) - like this it does not do anything YET.
        // now I have my array as stream

        // #2 - USING STREAM WITH ARRAYLIST
        List<Integer> list = new ArrayList<>(Arrays.asList(6,7,8,9));

        // Here we will convert arrayList to stream
        //with arrayList (Collection) we don't need to call any class, simply call the Collection reference -name- and . stream()
        list.stream();

        // -------------------------------------------------------------------------------

        // By converting them into stream im not really doing anything in the sense of printing in the consol. If I want to use some of the methods that this method has then i have to start implementing it`

        //STREAM METHODS
        //#1.1 - distinct(); - with list  -- > this will remove the duplicates from the arrayList

        List <Integer> list2 = new ArrayList<>(Arrays.asList(6,7,8,9,8,2,1,6,3,52,324,645));
        System.out.println("Distinct Method: "+list2.stream().distinct()); // Just like this it will do some action and show me the memory location ==> Distinct Method: java.util.stream.DistinctOps$1@2812cbfa
        // How do I get the actually removed version?
        // After we converted arrayList into Stream, and did some action (distinct()), we need to convert it back to arrayList
        // To do that, there is a method called "collect()"
        //This method will take the changes we made by stream, and convert it back to List, Set, Map or whatever you need
        System.out.println(" Distinct Method: "+list2.stream().distinct().collect(Collectors.toList())); //  Distinct Method: [6, 7, 8, 9, 2, 1, 3, 52, 324, 645] => this still not changing the data structure (if I went and re-assigned it, then I am changing the data structure)

        /*
        .stream() --> converts the list into stream
        .district() --> helped us to remove the duplicates
        .collect(Collectors.toList()) --> helped to convert stream back to List
         */

        System.out.println("Before stream: " + list2); // Before stream[6, 7, 8, 9, 8, 2, 1, 6, 3, 52, 324, 645]
        list2 = list2.stream().distinct().collect(Collectors.toList()); // here I actually changed and re-assigned to the original dataType
        System.out.println("After stream: "+list2); // After stream: [6, 7, 8, 9, 2, 1, 3, 52, 324, 645]

        // -------------------------------------------------------------------------------
        //#1.2 - distinct(); - with array  -- > this will remove the duplicates from the array
        // We will convert array into stream, then do some action, then convert it back to array
        // to convert string back to array we do not use .collect() method, instead we use .toArray


        int [] arr2 = {1,2,3,4,5,5,3,1,45,2,77,8,77};
        System.out.println(Arrays.stream(arr2).distinct()); // here i converted my array to be stream => java.util.stream.ReferencePipeline$4@2f7a2457 memory location
        System.out.println("Array Before Stream: " + Arrays.toString(arr2));
        arr2 = Arrays.stream(arr2).distinct().toArray(); //  re-assigned after doing some actions with stream - this is still a stream so i have to use .toArray to convert it back to array
        System.out.println("Array After Stream: "+ (Arrays.toString(arr2))); // Array After Stream: [1, 2, 3, 4, 5, 45, 77, 8]


        // -------------------------------------------------------------------------------
        // #4 - skip()

        ArrayList<Integer>list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list3.stream().skip(4).collect(Collectors.toList())); // the int provided in the () determines the number of items that will be skipped from the beginning
        // => [5, 6, 7, 8, 9, 10]
        System.out.println(list3.size()); // 10 -> the original size bc i only skiped and then printed
        System.out.println(list3.stream().skip(13).collect(Collectors.toList())); // will return [] empty bc is more elements that what it has

        String [] arr3 = {"a", "b", "c", "d", "e", "f"};
        System.out.println(Arrays.toString(Arrays.stream(arr3).skip(3).toArray())); //  [d, e, f] --> a b c was skipped (not removed)

        // -------------------------------------------------------------------------------
        // #5 - limit() --> only keeps the define number of elements kind of the opposite from skip, it only kees the first elements determined on the ()
        ArrayList<Integer>list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(     list4.stream().limit(6).collect(Collectors.toList())  );  // [1, 2, 3, 4, 5, 6] --> just keeps the size
        System.out.println(list4.stream().limit(7).skip(3).collect(Collectors.toList()));
        // limit(7) --> make the list only 7 elements 1,2,3,4,5,6,7
        // skip(3) --> it'll take the updated version (1,2,3,4,5,6,7) and skip the first 3 elements -->  [4, 5, 6, 7]


        // #6 - count() - number of elements
        List<Integer>list5  = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,5,6,4,5));
        // can you find how many different numbers you have? --> 1 2 3 5 6 4
        // Get me how many different numbers we have in list
        System.out.println(list5.size()); // 10
        System.out.println(list5.stream().count()); //10 this will give me a single number, so dont need to return it back
        // i'll use .count() instead so i can do method chaining and be abble to use other methods
        System.out.println(list5.stream().distinct().count()); //  6

        //Task: How many characters I have in String?
        String str = "aaaaaaaaaaabbbbbbbbbbbcccccccddddddeeeeeffffffgggg";
        System.out.println(Arrays.stream(str.split("")).distinct().count()); //  7: a b c d e f g ttotal number of different characters
        System.out.println(Arrays.stream(str.split("")).distinct().collect(Collectors.toList()));
        System.out.println(Arrays.toString(Arrays.stream(str.split("")).distinct().toArray()));

        /*
        You can use stream with ANY TYPE of Collection (List,Set, ) - Map
        ArrayList is the one mostly used, that is why we practice with that.
         */
    }

}

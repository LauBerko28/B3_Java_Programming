package day30_a_arraylist;
/*
    Given an ArrayList of words switch position for each pair in the List. A pair is an element and the element next to it.
    The given ArrayList will always have an even number of elements so each element will always have a single pair

    Ex:
    Input:
        {"Cat", "in", "the", "hat"}
        
        There is two pairs:
            "Cat" and "in"
            "the" and "hat"
            
    Output:
        {"in", "Cat", "hat", "the"}
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwitchBadPairs {
    public static void main(String[] args) {
        ArrayList <String> words = new ArrayList<>(Arrays.asList("cat", "in", "the", "hat" ));
        //                                                         0      1      2      3
        System.out.println(words); // [cat, in, the, hat]
        // i can not use swap directly because when i go to change the locations with the foreach i will not be able to use the indexes

        for (int i = 0; i < words.size(); i+=2) {
            // in each cycle i need to take 2 that is why i need to increment by 2 because the task tells me grab 2 and change them, and do it again until no more elements are left
            // first cycle my i is 0 and second cycle i =2

            Collections.swap(words, i, i+1);

        }
        System.out.println(words);  // [in, cat, hat, the]
    }
}

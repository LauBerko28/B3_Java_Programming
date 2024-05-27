package day30_a_arraylist;
/*
        Remove Long Strings

        Create a method that will accept an ArrayList of Strings and an int. Remove any String elements that have less characters than the given number.
        Return the modified ArrayList of Strings

        @param list - Given ArrayList of Strings @param int - max number of characters @return - ArrayList of Strings

        Ex: {"one", "two", "three", "four", "five", "six"} Max number: 4
        Output: {“three, “four”, “five”
 */

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {

    public static ArrayList <String> keepLong (ArrayList <String> list, int num){

        ArrayList <String> updatedList = new ArrayList<>();
        updatedList.removeIf(each -> each.length() < num); // i use the length to know how big it is and if it is less than the num provided then i will remove it


        return updatedList;
    }

    public static void main(String[] args) {

        //**INTERVIEW ** if im doing it by just fori loop i have to update my loop so i just want to with the predicate method take care of the outOFBounds output
        ArrayList <String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six"));
        System.out.println(keepLong(list, 4)); // if the size of the element is less than 4 then i want to remove it
        System.out.println(keepLong(list, 5)); // removes anything less than 5
        System.out.println(keepLong(list, 10)); //  removes anything less than 10
    }

}

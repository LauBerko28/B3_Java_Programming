package day28_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {
        // int [] arr = {1, 2, 3}; // this is my array and the dataType is array int

        /*
        Why do i use Arrays.asList()? --> to avoid doing many lines off adding to arrayList
         */
        Integer [] arr = {1, 2, 3}; //we made an Integer array ** i can assign it to an object type because array does accept both primitive and non primitive

        Arrays.asList(arr); // here I converted the array into a collection type by using asList()/ Collection Dta Structure (ArrayList)

         // ArrayList<Integer> l1 = Arrays.asList(arr); --> THIS IS NOT A VALID WAY TO USE IT i cannot do this because
         ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(arr)); // here im actually adding the list that i created to an ArrayList
       // Created an ArrayList with values from array which was converted into Collection Type

        // my arrayList was created from object type (Integer [] arr = {1, 2, 3};) if i would have left it as (int [] arr = {1, 2, 3};) then it'll not let me do so because ArrayList only works with non-primitive


        // Creating an ArrayLisr with some INITIAL values
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(12, 453, 65, 23, 87, 4, 23, 6)); // here im using var args (T...) which will create an array directly from given elements


        ArrayList <String> l3 = new ArrayList<>(Arrays.asList("Java", "Python", "C#", "C++"));  // this accepts the array and converts it into collection type
        System.out.println(l3);


    }
}

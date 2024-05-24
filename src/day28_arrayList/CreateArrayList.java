package day28_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList <String> listOne = new ArrayList<>();
        listOne.add("Hello");
        listOne.add("Bye");
        System.out.println(listOne); // [Hello, Bye]

        ArrayList <String> listTwo = new ArrayList<>(listOne); // we added elements from listOne into listTwo --> here i created a brand new ArrayList but copied exactly what it had on it

        // here i did not have to convert it to collection  array.aslist because i already had it as list

        System.out.println(listTwo);
        listTwo.add("Hola");

        System.out.println();
        System.out.println(listOne); //[Hello, Bye]
        System.out.println(listTwo); // [Hello, Bye, Hola]


        ArrayList <String> listThree = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println(listThree); // [one, two, three]

        //ArrayList <String> listFour = new ArrayList<>("One", "Two", "Three");  // THIS IS NOT VALID



    }
}

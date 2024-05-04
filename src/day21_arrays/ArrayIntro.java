package day21_arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        String str = "Chicago NeyYork Houston Denver Pittsburgh";

        // I have declared 5 different Strings - meaning 5 different containers
        String city1 = "Chicago";
        System.out.println(city1.charAt(0));
        System.out.println(city1.charAt(1));
        System.out.println(city1.charAt(2));
        System.out.println(city1.charAt(3));
        System.out.println(city1.charAt(4));
        System.out.println(city1.charAt(5));
        System.out.println(city1.charAt(6));
        String city2 = "NeyYork";
        String city3 = "Houston";
        String city4 = "Denver";
        String city5 = "Pittsburgh";


        // I have declared a String array that holds - "Chicago", "NeyYork", "Houston", "Denver", "Pittsburgh"
        // String cities [];  -- this is another way to declare Array
        String [] cities = {"Chicago", "NeyYork", "Houston", "Denver", "Pittsburgh"};

        // I have declared a String array that holds - city1, city2, city3, city4, city5 - variables
        //String [] cities2 = {city1, city2, city3, city4, city5};


        // How to access each element in the array
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);


        // How to print all cities USING INDEXES
        System.out.println("All cities: " + cities[0] + ", " + cities[1] + ", " + cities[2] + ", " + cities[3] + ", " + cities[4]);
        System.out.println("All cities in reversed order: " + cities[4] + ", " + cities[3] + ", " + cities[2] + ", " + cities[1] + ", " + cities[0]);


        // How can I print all ARRAY
        System.out.println(cities); // [Ljava.lang.String;@64616ca2 --> This does not PRINT ALL ARRAY. It gives some HASHCODE - kind of memory location.
        System.out.println(Arrays.toString( cities)); // We use Arrays class from java.util package that has a method called .toString(array); which helps to print array

        // How can I get ridd of the square brackets [] in out put - you can assign to String or you can do it in print statement directly
        String convertArr = Arrays.toString( cities).replaceAll(",", "");
        System.out.println( convertArr.substring(1, convertArr.length()-1) );
        System.out.println(convertArr); // This will print -- > [Chicago NeyYork Houston Denver Pittsburgh]



        // How do I know, how many element we have in array
        System.out.println(cities.length);




    }
}

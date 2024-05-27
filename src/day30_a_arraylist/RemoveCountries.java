package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
/*
    Remove Countries

    Create a method that will take an ArrayList of countries and returns an ArrayList of countries that have a length of less than 7
    @param nums - The given ArrayList of numbers @return - ArrayList of numbers
        Ex:

        Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
        Output: "Japan", "Korea", "Turkey", "Canada"
 */
public class RemoveCountries {

    public static ArrayList <String> removeCountries (ArrayList<String> countries){

        // because the task says remove always if length is less than 7 --> so 7 is hard coded that is why i dont need the int parameter
        countries.removeIf(e -> e.length() > 7);
        return countries;
    }

    public static void main(String[] args) {

        ArrayList <String> countryList = new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "Turkey", "Canada"));
        System.out.println(countryList);
        System.out.println(removeCountries(countryList)); // [Japan, Korea, Turkey, Canada]

    }
}

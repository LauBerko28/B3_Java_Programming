package day22_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {
        String str = "monday, tuesday, wednesday, thursday, friday, saturday, sunday";

        String [] days = str.split(", "); // it needs and argument inside the parenthesis, here i indicate how i want it to break the array
        System.out.println(Arrays.toString(days));

        for (String each : days){
        System.out.println(each);}

        System.out.println();
        String [] withOutDay = str.split("day"); // wherever you find this "day" split the array
        System.out.println(Arrays.toString(withOutDay)); // outcome will be mon, tues, wednes, ....
        for (String each : withOutDay){
            System.out.println(each);
        }

        System.out.println();
        String str3 = "Jan-Feb-Mar_Apr-May-Jun-Jul-Aug-Sep_Oct_Nov_Dec"; // jan feb
        String [] arr1 = str3.split("-");
        for (String each : arr1) {
            System.out.println(each);
        }


        System.out.println();
        String str4 = "Hello world!";
        String [] all = str4.split("");
        for( String each : all) {
            System.out.println(each);
        }


    }

}

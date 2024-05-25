package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListWithMethods {
    public static void main(String[] args) {

        System.out.println(getDaysOfWeek()); // [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday ]

        ArrayList <String> weekDays = getDaysOfWeek(); // since it returns me an arrayList i can assign it to another arrayList
        System.out.println(weekDays.get(0)); // Monday --> getting  the element at the indexOf 0

        System.out.println(printList(weekDays)); // calling printList method and passing weekDays
        /*
        LIST:
	        Monday
	        Tuesday
	        Wednesday
	        Thursday
	        Friday
	        Saturday
	        Sunday
         */

        System.out.println("***************");
        System.out.println( printList(getDaysOfWeek() )); // --> here im calling one method and passing another one through it

        System.out.println("-------------");
        ArrayList <String> list2 = new ArrayList<>(Arrays.asList("one", "two", "three"));
        System.out.println( printList(list2) );




    }

    public static ArrayList<String> getDaysOfWeek (){
        // i want this method to return all the days of the week

        ArrayList <String> weekDays = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday "));

        return weekDays;
    }

    public static String printList (ArrayList <String> list){
        //this method will return something in an specific format
        /*
        LIST:
            Monday
            Tuesday
            ...
         */
        String result = "LIST:";
        for (String each : list){
            result += "\n\t" + each;
        }
    return result;
    }

    // TODO: METHOD OVERLOADING ISSUE
//    public static String printList (ArrayList <Integer> list) {
//
//        // Return in specific format
//        /*
//            LIST:
//                Monday
//                Tuesday
//                ...
//         */
//        String result = "LIST:";
//        for ( Integer each : list){
//            result += "\n\t" + each;
//        }
//
//        return result;
//    }
}

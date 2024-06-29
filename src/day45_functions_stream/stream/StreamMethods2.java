package day45_functions_stream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMethods2 {
    public static void main(String[] args) {

        //#7 - map()
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        // list4.stream().map()
        // Here .map() works with Function - functional interface which accepts ONE Object and returns One object

        //Lets say I want to take each element from arrayList, multiply it by 2 and re-assign the result back to that list
        System.out.println("BEFORE: " + list4); // BEFORE: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        list4 = list4.stream().map((e)-> e * 2).collect(Collectors.toList()); // here i will take everything from the arrayList one by one and multiply it by 2
        System.out.println("AFTER: " + list4); //  AFTER: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

        System.out.println();

        List<String> list5 = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        // I want to loop through the list and assign it to a new arrayList. but i want to get rid of the "day" part
        System.out.println("Original list: " + list5); // Original list: [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]
        List <String> abbre = list5.stream().map(day -> day.substring(0,3).toUpperCase()).collect(Collectors.toList());
        System.out.println("Abbr: "+ abbre); // Abbr: [MON, TUE, WED, THU, FRI, SAT, SUN]

        // -------------------------------------------------------------------------------
        //#8 - filter()
        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,2,4,6,8,10));
        // . filter() works with Predicate - functional interface which accepts oNE Object and returns boolean

        //I want to get all even numbers and store into int List
        List <Integer> even = list6.stream().filter(eachNum -> eachNum % 2 == 0).collect(Collectors.toList());
        List <Integer> odd = list6.stream().filter(eachNum -> eachNum % 2 != 0).collect(Collectors.toList());
        System.out.println("Original: " + list6); // Original: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println("Even: "+even); // Even: [2, 4, 6, 8, 10]
        System.out.println("Odd: "+odd); // Odd: [1, 3, 5, 7, 9]


        // this is what .filter is doing in the background
        Predicate <Integer> e = n -> {
            if (n % 2 == 0){
                return true;
            }else {
                return false;
            }
        };

        List <Integer> even2 = new ArrayList<>();
        for (Integer each : list6){
            if(e.test(each)){
                even2.add(each);
            }
        }
        System.out.println(even2);  // [2, 4, 6, 8, 10]


        // How many even numbers we have?
        System.out.println(list6.stream().filter(each -> each % 2 == 0).count()); // this will give me total even numbers --> 5

        //without duplicates
        System.out.println(list6.stream().filter(each -> each % 2 == 0).distinct().collect(Collectors.toList())); // [2, 4, 6, 8, 10]
        System.out.println(list6.stream().filter(each -> each % 2 == 0).distinct().count()); // 5

        // -------------------------------------------------------------------------------
        //#9 - forEach()
        List<Integer> list7 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,2,4,6,8,10));
        //list7.stream().forEach();
        // .forEach() works with Consumer - functional interface which accepts oNE Object and DOES NOT return anything
        list7.stream().filter(each->each % 2 == 0 ).forEach(eachEven-> System.out.println(eachEven)); // loop through the array, find the even number and prints them
        list7.stream().filter(each->each % 2 == 0 ).forEach( System.out::println );  // this is a shortcut for print statement that works with Consumer


    }
}

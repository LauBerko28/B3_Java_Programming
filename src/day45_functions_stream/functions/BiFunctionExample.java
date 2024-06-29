package day45_functions_stream.functions;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        //R <T t, U u> ---> BiFunction accepts TWO Objects and returns one Object
        // abstract method: R apply(T t, U u);
        BiFunction<Integer, Integer, Integer> maxNumber = (num1, num2)-> {

          return num1 > num2 ? num1 : num2;
        };

        // now im calling the implementation
        System.out.println(maxNumber.apply(8, 50));

        System.out.println("----------------------");

        // make a function that accepts two List and returns Map
        //              accept list          , return Map of Int and String
        BiFunction<List<Integer>,List<String>, Map<Integer, String>> makeMap = (list1,list2)->{

            // first need to ensure the length of both lists is the same, otherwise i'll get an indexOutOfBoundException
            Map<Integer,String> map = new LinkedHashMap<>(); // Linked keeps insertion order

            if(list1.size() != list2.size()){
                throw new RuntimeException("Lists do not have the same size of elements");
            } else {
                for (int i = 0; i < list2.size(); i++) { // since this else part is for when list1 and list2 have the same size, it doesnt matter which one to use
                    // KEY   --> list1.get(i)
                    // VALUE --> list2.get(i)
                    //          KEY     ,   VALUE
                    map.put(list1.get(i), list2.get(i));
                }
            }


            return map;
        };
        List <Integer> numList = new ArrayList<>(Arrays.asList(1,2,3));
        List <String> strList = new ArrayList<>(Arrays.asList("a", "b", "c"));
        System.out.println(makeMap.apply(numList, strList)); // {1=a, 2=b, 3=c}
        // if the length were different then i will see: RuntimeException("Lists do not have the same size of elements"
    }
}

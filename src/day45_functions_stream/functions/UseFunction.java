package day45_functions_stream.functions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;

public class UseFunction {
    public static void main(String[] args) {

        // the method name for Function is apply
        // <T, R> --> accepts one Object Type (T), and return one Object Type (R)
        Function<int [], List<Integer>>  convertArrIntoList = arr -> { // once i call it, it will accpet int array and I want it to return as an ArrayList
            List<Integer> list = new ArrayList<>();

            for (int each : arr) {
                list.add(each);
            }
            return list;

        };

        // now i have to call the implementation
        int [] a = {34, 23, 62, 123, 64, 2, 123};
        System.out.println(convertArrIntoList.apply(a)); //  will return me an ArrayList [34, 23, 62, 123, 64, 2], the dataTyoe went from array to arrayList

        // also remove duplicates
        System.out.println( new HashSet<>(convertArrIntoList.apply(a))); // [64, 34, 2, 23, 123, 62]

        // also sort it
        System.out.println(new TreeSet<>(convertArrIntoList.apply(a))); // [2, 23, 34, 62, 64, 123]
    }
}

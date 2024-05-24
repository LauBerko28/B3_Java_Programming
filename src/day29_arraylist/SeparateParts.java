package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {

        String str = "ABCD123$%#@456EFG!";
         ArrayList <String> list  = new ArrayList<>(Arrays.asList(str.split(""))); // it took str and made it a String array -- by adding Arrays.asList i converted it as a collection type
        // list.addAll(Arrays.asList(str.split("")))
        System.out.println(list); // [A, B, C, D, 1, 2, 3, $, %, #, @, 4, 5, 6, E, F, G, !]

        ArrayList<String> numbers = new ArrayList<>(list);
        numbers.retainAll(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")); // if anything from list matches numbers then keep it
        System.out.println(numbers); // [1, 2, 3, 4, 5, 6]

        ArrayList<String> special = new ArrayList<>(list);
        special.retainAll(Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+"));
        System.out.println(special);// [$, %, #, @, !]

        ArrayList<String> letters = new ArrayList<>(list);
        letters.removeAll(numbers); // [A, B, C, D, 1, 2, 3, $, %, #, @, 4, 5, 6, E, F, G, !] - [1, 2, 3, 4, 5, 6]
        letters.removeAll(special); // [A, B, C, D, 1, 2, 3, $, %, #, @, 4, 5, 6, E, F, G, !] - [$, %, #, @, !]
        System.out.println(letters); // [A, B, C, D, E, F, G]


    }
}

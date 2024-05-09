package day22_arrays;

import java.util.Arrays;

public class JoinExample {
    public static void main(String[] args) {
        String [] words = {"a", "b", "c"};
        System.out.println(Arrays.toString(words));

        System.out.println(String.join("<>", words)); // a<>b<>c  has 2 arguments the first one is a string and the second one an Array
        System.out.println(String.join("---------", words)); // a---------b---------c
        System.out.println(String.join(" ", words)); // a b c


        String fromArr = String.join("", words); // abc
        System.out.println(fromArr);

        System.out.println(String.join("\"", words)); // a"b"c
    }
}

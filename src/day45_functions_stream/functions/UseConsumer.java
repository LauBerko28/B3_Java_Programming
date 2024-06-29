package day45_functions_stream.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseConsumer {
    public static void main(String[] args) {
        // Consumer does not return anythig its type is void
        // and the name of the method is accepts
        Consumer<Integer> printN = n -> { //7 --> 1,2,3,4,5,6,7
            for (int i = 1; i <=7 ; i++) {
                System.out.print(i + " ");
                
            }
        };

        // reference = printN
        // .accept = method from Consumer class
        // 7 = is the number that i want to repeat
        // Since i am in the same class as my implementation, and calling that function from the same class, I do not need to use the Interface name
        // accept(T t); is the abstract method defined inside the Consumer functional interface
        printN.accept(7); // 1 2 3 4 5 6 7  --> this one does not need to be on print statement bc this method does not have a return type is only void


        System.out.println("-----------------");

        List<String> list = new ArrayList<>(Arrays.asList("Hello", "Java", "Summer", "Winter", "Pool")); // directly assigning the values to the arrayList
        list.forEach( (e) -> {System.out.println(e);} ); // this is actually a method from Consumer --> Hey I'm going to send you consumer, please loop through the colelction and get each element, and assign each of the elements into this element
        // forEach method comes from iterable but works with Consumer
        // list.forEach => will take each word of the collection and print them one by one
        // (e) -> {System.out.println(e);} ==> this is the consumer implementation
        // e - Once getting each element, it assigns it into "e"
        // and then with the print statement im only printing it out
        // System.out.println(e) => lambda expression body / implementation -- which is just a print statement

        list.forEach(e->{
            System.out.println(e.charAt(0) + " " + e.charAt(e.length()-1)); // H o - J A - S r - W r - P l --> here im getting the first and last char
        });
        list.forEach(e -> {
            if (e.length()>4){
                System.out.println(e); // here im only asking it to print when the length is bigger than 4
            }
        });

    }
}

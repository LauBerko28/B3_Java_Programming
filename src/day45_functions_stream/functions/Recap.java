package day45_functions_stream.functions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Predicate;

public class Recap {
    public static void main(String[] args) {
        //Create a function that can verify if a number contains duplicate digit
        // --> 1021341 - true
        // --> 123456 - false

        // I know there is a built in function called predicate that returns me true / false

        Predicate<Integer> verifyDuplicates = (number)->{

            String numInString = number + ""; // --> here i have converted the number into string => "1021341" --> I have to loop through this string and get one by one
            String uniques = "";
            boolean result = false;

            for (int i = 0; i < numInString.length(); i++) {

//                if(!uniques.contains( numInString.charAt(i) + "" )){ // if unique doesnt contain the character then i want ti to add it as shown below, i need to concatinate bc .contains accepts string. but charAt returns a char, so by concatinating is making it String
//                    uniques += numInString.charAt(i); // "102
//                } else {
//                    return true; // once I reach the one number that is duplicate the loop is going to end because the duplicates are now true
//                }

                // If I want to improve my code i can do it this way instead

                result = Collections.frequency(Arrays.asList((number + "").split("")),numInString.charAt(i)+"") > 1 ? true : false ; // (number+"").split("") --> "1021341" -> ["1" "0" "2" "1" "3" "4" "1"]
                //  collections.frequency requires a collection object and one argument, so to make it work i take the String and split it to get an Array, but array is not collection type, so to make it collection type i use the method Arrays.asList to make it an array, but i still need to concatenate bc number itself is integer not string
                // then what i need the second part of the Collections.frequency which is the argument object, and here im passing the single char i obtained from my loop to check if it has been repeated or not
                // finally with the help of ternary i check if the frequency is more than 1 or not, if is more than one return me true bc this means there are duplicates, but if not return me false bc there are not duplicated

                if(result){ // here im basically saying that once this is true please exit the loop
                    break;
                }

            }
            return result; // if it loops through all the numbers and it never finds a duplicate, will return false because there is not dup information
        };

        // referenceName = verifyDuplicates
        // .test = required for this built in lambda expression for PREDICATE
        // () =
        System.out.println(verifyDuplicates.test(1021341)); // true --> because there are duplicates
        System.out.println(verifyDuplicates.test(123456)); // false --> because there are NOT duplicates
    }
}

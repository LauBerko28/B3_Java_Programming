package day44_map_and_functions.buildIn_functions;
/**
 *     Predicate<T>
 *         defines a function that takes one object as the argument and returns boolean
 *
 *         method: test()
 */
import java.util.function.Predicate;

public class UsePredicate {

    // Predicate comes from the .function package --> already in java im just using it

    public static Predicate<String> isPalindrome = (str)->{
        String reverse = new StringBuilder(str).reverse().toString(); // the .toString will assign it back to String
        return str.equals(reverse);
    };
    // make it public to see it anywhere in the project
    // I made it static so i can call it by the class name
    // i have created an implementation for isPalindrome
    // create a method that will return me a predicate

    // with the Predicate i'll have some implementation
    // here im trying to create an implementation here so it can be re-usable anywhere in my project

    // LETS HAVE ANOTHER IMPLEMENTATION
    // prime number is divisible by itself and 1
    public static Predicate <Integer> isPrime = (number)->{
        int counter = 0;
        for(int i = 1 ; i < number; i++){
            if (number % i == 0 ){
                counter++;
            }
        }
        if (counter ==2 ){
            return true;
        } else {
            return false;
        }
    };
}
/**
 * I have created a class that has used the Predicate functional interface
 * and had 2 different implementations of test() method (which returns boolean)
 */

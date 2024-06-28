package day44_map_and_functions.buildIn_functions;

public class CallPredicateMethods {
    public static void main(String[] args) {

        boolean b = UsePredicate.isPalindrome.test("racecar"); // this will return boolean  so i can assign it to it
        System.out.println(b);

        UsePredicate.isPalindrome.test("apple");

        System.out.println(UsePredicate.isPrime.test(7));
        System.out.println(UsePredicate.isPrime.test(8));

    }
}

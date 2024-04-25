package day16_loops;
/*
    [Middle char]
    Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.    b) If the length of the string is odd there will be one middle character.
        Ex:
        Input: elephant
        Output: The middle characters: ph
 */
public class MiddleChar {
    public static void main(String[] args) {

        // "abcdef" --> 6 - even --> cd
        // "abcde"  --> 5 - odd  --> c

        String str = "abcde";  //  5
        //            01234
        //            length()/2 -- > 2,  3

        String evenOrOdd = "";


        if (str.length() % 2 == 0) { // even

            evenOrOdd = str.substring( str.length()/2 - 1, str.length()/2 +1);  // 2, 3 -- > c

        } else {  // odd

            //evenOrOdd = str.substring(str.length()/2, str.length()/2 + 1);
            evenOrOdd = str.charAt(str.length()/2)+""; // need to concatenate to make it a String

        }

        System.out.println(evenOrOdd);

    }

}

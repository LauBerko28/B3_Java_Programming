package day24_methods;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("how many chapters are in book: ");
       // int num = key.nextInt(); --> here the user will tell me how many books they need = array size

        String [][] book = new String [key.nextInt()][]; // --> here im adding the size of the array based on the user input // USER ENTERED 2 LETS SAY
        //                  here im saying the amount of single dimmensional arrays
        // book [0] = new String []{"h", "a"} --> here im saying on the index od 0 in my 2D array (first single array) assignd the values of h and a

        System.out.println(Arrays.deepToString(book)); // this will give me a null result as this is only printing
         // System.out.println(book[0][0]); NullPointerException because i dont have anythign assigned to it

         key.nextLine();  // --> im adding this one because after using any .next before .nextLine so it doesnt take enter as an input
        for( int i = 0; i< book.length; i++){
            System.out.println("Enter paragraph for each chapter: "); // if lets say USER ENTERED 2 on the array size, it will print this question twice

           // book[i] = key.nextLine().split("! ");  --> here im just simplifying and assigning what the using gave me directly to the book
            String eachParagraph = key.nextLine();



            String [] eachSentence = eachParagraph.split("! "); // hey take the sentence and split it by ! character --> this becomes and array
                                                                     // ["Hello people",  "Welcome to our new class", "Today we will cover methods!"]
                                                                    // ["Bye people" , "See you later!"]

            book[i] = eachSentence; // here im assigning the string sentence and assigning it to each space of the book (using the i will assign it to that index)
        }
        System.out.println(Arrays.deepToString(book));
    }
}

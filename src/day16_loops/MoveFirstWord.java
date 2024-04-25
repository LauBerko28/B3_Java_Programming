package day16_loops;
/*
    [Move first word]
        Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        Ex:
        Input: Java is a fun language
        Output: is a fun language Java
        Hint: Use indexOf and substring
  */
import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = key.nextLine().trim();

        // Take the part from sentence - .substring(0, indexOfFirstSpace)
        //                      how do I get indexOfFirstSpace - > .indexOf(" ")

        //int indexOfFirstSpace = sentence.indexOf(" ");
        //String firstWord = sentence.substring(0,  indexOfFirstSpace);

        String firstWord = sentence.substring(0, sentence.indexOf(" "));

        // String restOfSentence = sentence.substring(sentence.indexOf(" ").trim()); // is a fun place
        String restOfSentence = sentence.substring(sentence.indexOf(" " + 1));

        System.out.println(firstWord + " " + restOfSentence); // Java is a fun language Java






    }
}

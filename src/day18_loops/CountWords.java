package day18_loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence = input.nextLine().trim();
        int countSpace = 0;

        //Java is a cool language.
        //Solution: count the number of spaces
        //         + 1 --> total words
        // hOW CAN I COUNT HOW MAN Y SPACES I HAVE?
        // Go through each character and check if it is equal to space - if it is then increase the count

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {  // if ( (sentence.chartAt(i)+"").equals(" ")  )
                countSpace++;

            }
            // System.out.println(sentence.charAt(i));


        }
        //  Hi people -- >  1 space is 2 words that is why i have countSpace+1
        //  He nice people -- > 2 space is 3 words and so on
        System.out.println("There are total of " + (countSpace+1) + " words");
    }
}

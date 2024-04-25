package day15_string;

public class CharMethod {
    public static void main(String[] args) {
        String str = "loop";
        //index       0123
        //              (number of characters - 1)
        //count char= 4 character
        System.out.println(str.length()); // 4

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3)); // last character

        char first = str.charAt(0); // The charAt(index); method returns us a SINGLE CHARACTER

        // System.out.println(str.charAt(4));// it gives StringIndexOutOfBoundsException error - and nothing in code after this line will run

                // Can you give me last character of the String
                String longWord = "al;dskfnj'aermv 'al;dsadls;kmva'fdl;kfvaldv kmfa'dklsfl'ds;kvfadsflkdjfvabdsfalskdflsdkf";
                //                 0123
                System.out.println(longWord.length());
                System.out.println(longWord.length()-1);
                System.out.println(   longWord.charAt(   longWord.length()-1   )   );

                // Can you get me the last 2nd character
                System.out.println(longWord.charAt( longWord.length() - 2));


                System.out.println("Num of character: " + longWord.length());
                System.out.println("Last index of String: " + (longWord.length() - 1)) ;
                System.out.println("Last character :  "  + longWord.charAt( longWord.length() - 1));





    }
}

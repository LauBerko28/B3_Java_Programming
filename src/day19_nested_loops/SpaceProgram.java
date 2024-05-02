package day19_nested_loops;

import java.util.Scanner;

/*
    Space program [String, Loops]

    Given a String return a version of with spaces between all of the letters.
    If there is already a space in the String put an underscore

        Ex: java    -> j a v a
            space     -> s p a c e
            more words -> m o r e _ w o r d s

 */
public class SpaceProgram {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your sentence: ");

        String str = key.nextLine();//"more words"; // "m |o |r |e |"


        str = str.replaceAll(" ", "_");
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            result += str.charAt(i) + " ";

//            The if condition is valid if you do not do the .replaceAll method above
//            if (str.charAt(i) == ' ') {
//                result += "_" + " ";
//            } else {
//                result += str.charAt(i) + " ";
//            }

        }


//        System.out.println(result);
        System.out.println(result.trim());
    }

}





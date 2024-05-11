package day19_nested_loops;
/*
    Reverse only second word [String, Loops]

    Given a String with three words separated by spaces. Reverse only the second word and return the modified String
        Ex:
        I love java

        Ouput:
        I evol java
 */
public class ReverseMiddle {
    public static void main(String[] args) {

        String str = "You love java";
        //            0123456789012

        int fistSpaceIndex = str.indexOf(" ");  //3
        int lastSpaceIndex = str.lastIndexOf(" ");  //8

        String middle = str.substring(fistSpaceIndex+1, lastSpaceIndex); // love
        String reversed = "";


        for (int i = middle.length()-1; i >= 0 ; i--) {

            reversed += middle.charAt(i);

        }

        //System.out.println(reversed);
        // You evol java
        //"You love java"

        System.out.println( str.substring(0, fistSpaceIndex+1) + reversed + str.substring(lastSpaceIndex));







    }
}
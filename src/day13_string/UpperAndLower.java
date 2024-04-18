package day13_string;

public class UpperAndLower {
    public static void main(String[] args) {

        String str = "sNOw";
        System.out.println(str.toUpperCase()); // converts String to be all UPPERCASE

        str = str.toUpperCase(); // we created COMPLETELY new String - it re-assigned
        System.out.println(str);

        System.out.println("***********");
        System.out.println(str.toLowerCase());
        System.out.println(str); // this will print as SNOW as it was not re-assigned
        str = str.toLowerCase();
        System.out.println(str); // here i reassigned the value so if i print str again will continue in lower case

        String word1 = "Loop";
        String word2 = word1 + "camp".toUpperCase(); // Loop + CAMP -- >  LoopCAMP
        System.out.println(word1.toUpperCase() + word2.toLowerCase());

        System.out.println(word1 + word2);













    }
}

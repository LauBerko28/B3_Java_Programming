package day18_loops;

public class PrintEachChar {
    public static void main(String[] args) {

        String str = "loopcamp";
        //            01234567


        // repeated action is String and what happens is that the location increments by 1 everytime
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));


        //this is with loop
        for (int i = 0; i < str.length(); i++) { // [7 <= 8-1] || [ 7 < 8]
            //             <= str.length() --> exception error because there is nothing on that spot
            //              str.indexOf("x") --> result is -1 as there is no "x" on the statement
            System.out.println(str.charAt(i));

            // i <= str.length()-1 ----> 7 <= 8 -1
            // i < str.length () ------> 7 < 8

            //To show the contains method with IndexOf()

            System.out.println(str.contains("x"));

            if (str.indexOf("x") == -1) {
                System.out.println(false);
            }

        }

    }
}

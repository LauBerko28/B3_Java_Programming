package day18_loops;
/*
    Characters in String
        Given a String print the ascii value codes for each character
        Ex:
            Input:
                java
            Output:
                106 97 118 97
 */
public class CharactersInstring {
    public static void main(String[] args) {

        String str = "java";

        for (int i = 0; i < str.length() ; i++) {

            //int numChar = str.charAt(i);
            //System.out.println(numChar);
            System.out.println((int)str.charAt(i));
        }

    }
}

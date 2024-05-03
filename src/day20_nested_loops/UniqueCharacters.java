package day20_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "AABCDDFGWOF&#($";

        // Find the only the unique characters
        int count;
        for (int i = 0; i < str.length(); i++) {

            char eachLetter1 = str.charAt(i); // For Option 2 : String eachLetter1 = str.substring( i, i+1 );
            count = 0;

            for (int j = 0; j < str.length(); j++) { // "AABCDDFGWOF&#($";


                char eachLetter2 = str.charAt(j); // For Option 2 : String eachLetter2 = str.substring( j, j+1 );

                if (eachLetter1 == eachLetter2) { //For Option 2 :  eachLetter1.equals(eachLetter2) {
                    count++;
                }

            }


            if (count == 1) {
                System.out.print(eachLetter1);
            }

        }






    }
}

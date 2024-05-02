package day19_nested_loops;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String original = "abcabbcd"; //String literals
        String unique = "";

        //loop through and get each character
        //      add this each character into another container

        for (int i = 0; i < original.length(); i++) {                // abcabbcd - > 1 - a     | 2 - b  | 3 - c | 4 - a | 5 - b

            char eachLetter = original.charAt(i);                   // a | b | c | a | b

            if (!unique.contains(""+eachLetter)){  // contains(""); // unique = "a" | unique = unique(a) + "b" --> unique = "ab" | unique = "abcd"
                unique += eachLetter;
            }

        }

        System.out.println("Original:\t" + original);
        System.out.println("Unique:\t\t" + unique);


        /*
        // Thi sis the 2nd option with continue;
        for (int i = 0; i < original.length(); i++) {

            char eachLetter = original.charAt(i);

            if (unique.contains(""+eachLetter)){
                continue;
            }
            unique += eachLetter;

        }
 */


    }
    }

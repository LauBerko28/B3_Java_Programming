package day19_nested_loops;
/*

    String apple

    count how many times each letter is in the String

    a - 1
    p - 2
    l - 1
    e - 1

    what we will try to do:

        we will go one character at a time

        charAt(0) --> a

            apple
                a == a
                a == p
                a == p
                a == l
                a == e

         charAt(1) --> p

             apple

                p == a
                p == p
                p == p
                p == l
                p == e

 */
public class FrequencyOfCharacter {
    public static void main(String[] args) {


        String str = "apple";
        String checked = "";


        // OUTER LOOP
        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i);
            int count = 0;
            if (checked.contains(letter+"")) {
                continue;
            }

            // INNER LOOP
            for (int j = 0; j < str.length(); j++) {

                char letter2 = str.charAt(j);

                if (letter == letter2){
                    count++;
                }

            }

            System.out.println(letter + " - " + count);
            checked += letter;

        }

    }
}

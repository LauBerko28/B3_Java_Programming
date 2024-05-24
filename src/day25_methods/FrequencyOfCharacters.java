package day25_methods;

import my_utilities.StringUtil;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String word = "apple";
        char letter = 'p';

        System.out.println(frequencyOfCharacters(word, letter));

        frequencyOfCharacters("loopcamp" , 'o');

        System.out.println(StringUtil.frequencyOfCharacters("wednesday", 'e'));


    }

    public static int frequencyOfCharacters(String word, char letter){
        int count = 0;
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i)== letter){
                count++;
            }

        }
        return count;
    }

}

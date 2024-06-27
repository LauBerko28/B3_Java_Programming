package day43_a_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String word = "loopcamp";
        frequencyOfCharacters(word); // I can call it here bc it is static method

    }
    /*
    l-1
    0-2
    p-1
    c-1
    a-1
    m-1
     */

    public static void frequencyOfCharacters(String word) {  // loopcamp
        // remember if i only want to see the return type will be void

        Map<Character,Integer> map = new LinkedHashMap<>(); // with LinkedHashMap im making it insertion order kepts

        for (int i = 0; i < word.length(); i++) { // I want to loop through word and get each char
            char eachChar = word.charAt(i); // here im getting eachChar

            if(!map.containsKey(eachChar)){ // hey in my map go check if i do not have this eachKey (char) then add it to the map and the count (Integer from the value side)
                map.put(eachChar, 1); // I can do this here because AUTOBOXING is happening
            } else {
                //       KEY    , VALUE= .get(KEY)
                map.put(eachChar,map.get(eachChar)+1); // Maps do not allow duplicates, so everytime that it reads the same letter instead of adding a new object, it updates the value of the same by 1
            }
            // .get() tales the key and returns the value
        }
        System.out.println(map); // {l=1, o=2, p=2, c=1, a=1, m=1}
    }
}

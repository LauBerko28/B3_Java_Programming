package day24_methods;

public class LastCharacters2D {
    public static void main (String [] args){

        String [] [] words = {
                {"James", "is" , "back"},
                {"he","was", "never", "gone" },
                {"methods","tomorrow"}
        };

        String store="";
        for (String [] eachArr : words){
            for (String eachWord : eachArr){

                // You can convert each String into char Array and then get the last element as well.
                //System.out.print(eachElem.toCharArray()[eachElem.toCharArray().length -1]);

                store += eachWord.charAt(eachWord.length()-1);
            }
            System.out.print("here i used a nested for each: "+store);
        }


        System.out.println("*******************");
        for (int i = 0; i < words.length; i++) {
           //  words[i] --> this gets me to the single arrays
            for (int j = 0; j < words[i].length; j++) { // here im looping through each element of the array
               // words[i][j] --> j is going through each index of i
                System.out.println(words[i][j].charAt( words[i][j].length() - 1 )); // i can do .charAt because due to j its returning me a string

                // You can convert each String into char Array and then get the last element as well.
                //System.out.print(words[i][j].toCharArray()[words[i][j].toCharArray().length-1]);


            }

        }
    }
}

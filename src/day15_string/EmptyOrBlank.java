package day15_string;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "new example";
        System.out.println(str.isEmpty()); // returns FALSE as there are characters

        str = " ";
        System.out.println(str.isEmpty()); // returns FALSE as has an empty character

        str = "";
        System.out.println(str.isEmpty());// it is completely empty, no single character --> returns TRUE

        System.out.println(str.length()); // 0

        // (0 == 0)
        if (str.length() == 0){
        System.out.println("No characters");
    }

       str = "";
        System.out.println("Is empty: " + str.isBlank()); // TRUE ** possible update in java --> normally it checks for empty spaces
        System.out.println("Is blank: " + str.isEmpty()); // TRUE

        str = "Hello world"; // here we have characters other than the empty space
        System.out.println(str.isBlank()); // FALSE

        str = " "; // ONLY EMPTY SPACE
        System.out.println(str.isBlank()); // TRUE
        System.out.println(str.isEmpty()); // FALSE

        str = "      ";
        System.out.println(str.isBlank()); // returns TRUE
}}


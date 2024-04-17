package day08_scanner_logical_operators;

public class Letters {
    public static void main(String[] args) {
        // I can do it also to dataType Char
        // TASK: define a character. Print the next 4 characters

        char letter = 'G';

        System.out.println("Original character " + letter);

        System.out.println("Next 4 characters: ");

        //System.out.println(letter + 1); // 73 because int (1) is bigger than char so it all turns into int

        //System.out.println( letter++); // here letter = H

        System.out.println(++letter); // letter + 1  --> letter = letter +1
        System.out.println(++letter);
        System.out.println(++letter);
        System.out.println(++letter);



    }
}

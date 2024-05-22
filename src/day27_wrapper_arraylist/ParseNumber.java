package day27_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
        String year = "2024"; // there are some cases on which i'll need to take a String to make it a number, like the below year example
         // String year = "2024b"; --> to be able to convert it the whole original string must be a digit, if i had 2024b i will get an Exception message


        // normal concatenation
        System.out.println("Current Year: " + year);
        System.out.println("Next year will be: " + year + 1); // output will be Current Year: 20241 as this is trying to add a String

        int yearInNum = Integer.parseInt(year); // int yearInnuM = 2024;


        System.out.println("Current Year: " + yearInNum);
        System.out.println("Next year will be: " + (yearInNum + 1));

        /*
         This is not possible as a String is not a return boolean, but i can pass it to a boolean to get it correctly
                String s = "true";
        if (s){
            System.out.println("correct");
        }
        */

        System.out.println("************************");
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your message in this format: I am $x years old ");
        String str = key.nextLine(); // I am 30 years old

        //In 5 years, I will be $x+5 years old --> to do this i need to create an array and split it by space so i can find the
 /*
 THIS IS THE SAME AS SHOWN ON LINE 41, THERE I WROTE IT IN 1 LINE
        String [] arr = str.split(" ");
        arr[2]
  */

        String age = str.split(" ")[2]; // "30" ---- > // I am 30 years old -- > ["I", "am", "30", "years", "old"] [2]
        int ageInNum = Integer.parseInt(age);
        //System.out.println("In 5 years, I will be " + (age+5) + " years old"); //305
        System.out.println("In 5 years, I will be " + (ageInNum+5) + " years old"); //35




    }
}

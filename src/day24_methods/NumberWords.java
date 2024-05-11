package day24_methods;
import java.util.Scanner;

public class NumberWords {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a number and I will convert it into text: ");
        int num = key.nextInt(); // -1, 1000, 3

        System.out.println(   numberAsWord(num)   );

    }


    // Make a method that takes a number between 1 and 10 and returns word format of it.
    // 1 -- > one
    // 8 -- > eight


    public static String numberAsWord (int num) {
        String result = "";

//        if (num == 1) {
//            result = "One";
//        } else if (num == 2) {
//            result = "Two";
//        } .....
//        }else {
//          result = "Number is not between 1 and 10";
//        }


//        switch (num){
//            case 1:
//                result = "One";
//                break;
//            case 2:
//                result = "Two";
//                break;
//            default:
//                result = "Number is not between 1 and 10";
//        }


        String [] days = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "None", "Ten"};

        if (num >= 1 && num <= 10) {
            result = days[num-1];
        } else {
            result = "Number is not between 1 and 10";
        }


        return result;
    }}

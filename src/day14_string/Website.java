package day14_string;

import java.util.Scanner;

/*
    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net

      in cases it is not valid, tell the reason why

 */
public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a website: ");
        String url = input.next().toLowerCase(); // .toLowerCase() -> will convert to lowercase everything that is being input by users

        boolean isValidStart = url.startsWith("www.");
        boolean isValidEnd = url.endsWith(".com") || url.endsWith(".edu") || url.endsWith("gov") || url.endsWith("net") || url.endsWith("io");

        if (isValidStart && isValidEnd){
            System.out.println("This is a valid website.");
        }else {
            System.out.println("This is an invalid website.");
            if (!isValidStart){
                System.out.println("It was an invalid starts");
            }
            if (!isValidEnd){
                System.out.println("It was invalid end");
            }
        }
    }
}

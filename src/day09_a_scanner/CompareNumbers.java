package day09_a_scanner;
//#1 - we need to have the import to be able to use Scanner class
// import java.util.Scanner;
import java.util.Scanner;

/*
    create a Scanner object
    ask the user to enter 2 numbers
    check if the numbers are equal to each other
 */
public class CompareNumbers {
    public static void main(String[] args) {

        //#2 we declare the Scanner reference and assign an object to it
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: " );
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        boolean areNumsEqual = num1 == num2;
        System.out.println("The numbers are equal: " + areNumsEqual);




    }
}

package day24_methods;
import java.util.Scanner;

/*
    make a method that calculates the prints the age
    takes the birth year as an input
 */
public class Age {

    public static void getAge (int birthYear) { // this method accepts int as a parameter
        System.out.println("Age: " + (2024 - birthYear));
    }

    public static void main(String[] args) {

        getAge(2000); // Here I passed value directly --> this is an argument ()

        int year = 1990;
        getAge(year); // I passed the value from variable

        //getAge();  // this will give an error becayse we do NOT have a method getAge() which does not have anything in parenthesis

        Scanner key = new Scanner(System.in);
        System.out.print("When were you born? ");
        //int year2 = key.nextInt();
        getAge( key.nextInt());

    }
}
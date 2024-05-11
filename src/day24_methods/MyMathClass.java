package day24_methods;


public class MyMathClass {

    // create 4 custom methods that accepts two parameters and calculates ADDITION,SUBTRACTION,MULTIPLICATION and DIVISION

    public static void calculate(int num1, int num2) { // in the same method i cannot have same name for variables
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }

    public static void minus(int num1, int num2) {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // here im passing the nums
    }

    public static void multi(int num1, int num2) {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public static void divide(int num1, int num2) {  // num 1 and num2 will store the value i assign on my main method
        // i can change the dataType to double and will print as 0.0
        // lets say the number i was given is 0 for the second number and as i cannot do a division by 0 i have to handle it, that is why i create the if statement to manage those cases

        if (num2 == 0) {
            System.out.println("Cannot divide by 0");
        } else {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

        }

    }
    public static void main (String[]args){

        //order matters inside the parenthesis
        calculate(3, 5);  // here im only calling the methods
        minus(3, 5);
        multi(3, 5);
        divide(3, 5);
        divide(3,0); // ArithmeticException by zero


    }
}

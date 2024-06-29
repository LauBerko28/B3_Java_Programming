package day40_exception.learn_exc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        try {

            // Because all the errors are related to the same it makes more sense
            System.out.println("Enter a number: ");
            int userNum = input.nextInt(); // one possible issue is that the user gives me the number as a String instead of as a number --> InputMismatchException --> RUNTIME EXCEPTION
            // also that the user provides a huge number that int cannot hold

            System.out.println("Enter another number: ");
            int userNum2 = input.nextInt();


            System.out.println(userNum / userNum2); // one of the possible issues that i can have is that userNum2 = 0 --> ArithmeticException --> RUNTIME EXCEPTION

            // the scope of e is only available on each code block that is why i dont have an issue
        } catch (InputMismatchException e){
            e.printStackTrace(); // show me the exception in details in Console

        }catch (ArithmeticException e){
           // System.out.println(e.getMessage()); // --> " / by zero " i put it into a print statement because .getMessage method returns String
            e.printStackTrace(); // this one will show me the details error

        } finally { // this is optional ~~ whether the try/catch throws an exception or not, the "Finally block" will always run after
            System.out.println("FINALLY BLOCK"); // will run after last catch - will ALWAYS run
            input.close(); // "close the connection" --> closing the Scanner
        }

       // catch (Exception e){} --> By ITSELF does not have a purpose

        System.out.println("Done"); // this one will be printed because it is out of the try catch block


    }
}

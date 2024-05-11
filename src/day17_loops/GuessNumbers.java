package day17_loops;
/*
    create a program to guess the secret number.
    flow will be as follows:
    define the secret number, hard coded
    ask the user to guess a number
    based on the guess tell them a message:

    if they guess higher than the number:
      too high

    if they guess lower than the number:
      too low

    if they guess the number:
      you guessed correctly

      -> this will stop the guessing flow

    Challenge: keep track of the number of attempts taken to guess right
 */

import java.util.Scanner;

public class GuessNumbers {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int secretNumber = 80;
        int userGuess;
        int attempt = 0;

        do {
            System.out.print("Guess a number from 1 to 100: ");
            userGuess = key.nextInt();

            if(userGuess > secretNumber){
                System.out.print(userGuess + " is higher. Guess again.");
            } else if (userGuess < secretNumber) {
                System.out.print(userGuess + " is less. Guess again");
            } // else{
            //System.out.println("You guessed correctly!");
            // in this exersice will work because im covering the other 2 possibilities on the first if and else if
            // the problem of doing it here is that it'll print it before checking the condition of else

            attempt++; // here i just count how many times i loop

        } while (userGuess != secretNumber); // 40 != 40 i want the loop to end when the user guesses correctly.  use the != as i want the loop to check again when the number is different than the secret number
        System.out.println("You guessed correctly on the " + attempt + "attempt");
        // i do it out here, because the loop
        // this is a better practice to do it again

    }
}

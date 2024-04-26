package day17_loops;


import java.util.Scanner;

/*
write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
    1
    Ask a user:
    Tell if it is biggest or smallest.
Ask a user:
tell if it is biggest or smallest
 */
public class MaxAndMin {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("How many number you want to compare: ");
        int numOfCycle = key.nextInt();

        int n = 1;
        int userNum;

        int max = -2_147_483_647; // smallest value int can take
        int min = 2_147_483_647;  // biggest value int can take


        while (n <= numOfCycle) { // (n <= 5) if im asking a user to enter it 5 times then this is how i determine the condition
            // this will run 5 times until it reaches the false 6<=5
            System.out.println("please enter a number: ");
            userNum = key.nextInt();
            String allNums = "";

            allNums += " " + userNum;
            if (userNum > max) {
                max = userNum;   // max = 78; 100
            }

            if (userNum < min) {
                min = userNum;  // min = 78;  45; -34
            }
            n++; // hey every cycle please update my n

            System.out.println(min); // -34
            System.out.println(max); // 100
            System.out.println("All the numbers from user: " + allNums);

        }












    }
}

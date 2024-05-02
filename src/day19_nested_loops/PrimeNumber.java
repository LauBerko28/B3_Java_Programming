package day19_nested_loops;
import java.util.Scanner;

/*
            [IQ] Prime number [Loops]

            Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

            Ex:
                Input:
                    11

                Output:
                    prime

            Ex:
                Input:
                    10

                Output:
                    not prime
 */
public class PrimeNumber {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a number: ");
        int num = key.nextInt(); // 7 -- 1, 2, 3, 4, 5, 6, 7
        int count = 0;  //


        for (int i = 1; i <=  num; i++) {

            if (num % i == 0) {
                count++;
            }

        }

        if (count == 2) { // The reason we check it against 2 is because prime number can be divisible only 2 times.
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is NOT prime number");

        }


    }
}

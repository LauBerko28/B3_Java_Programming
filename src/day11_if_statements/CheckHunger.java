package day11_if_statements;

import java.util.Scanner;

public class CheckHunger {
    public static void main (String []args){

        Scanner input = new Scanner(System.in);

        System.out.print("Are you hungry? [true/false]");
        boolean isHungry = input.nextBoolean();

        //Approach #1 - SINGLE IF statement

        if (isHungry) {
            System.out.println("You are hungry, so I will get some food for you.");
        }

        if (!isHungry){ // no, im not hungry
            System.out.println("Great, then practice java");
        }

        // Approach # 2 - IF-ELSE  * ONE **
        if (isHungry) {
            System.out.println("You are hungry, so I will get some food for you.");
            }else{
            System.out.println("Great, then practice java");
        }
        // Approach # 3 - IF-ELSE  * ONE ** same as above but without brackets
        if (isHungry)
            System.out.println("You are hungry, so I will get some food for you.");
        else
            System.out.println("Great, then practice java");

    }
}

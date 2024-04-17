package day10_if_statements;

public class IfWithoutbRACKETS {
    public static void main (String []args){

        if (4 > 2 ){
            System.out.println("Hello");
            System.out.println("Bye");
        }

        if (4 > 2) System.out.println("hello2"); // you can do this ONLY if you have ONE statement

        System.out.println("Bye2");

        if ( 10 % 5 == 0){
            System.out.println("divisible");
                    }else {
            System.out.println("NOT divisible");
        }

        if (10 % 5 == 0)
            System.out.println("divisible");
        else
            System.out.println("NOT divisible");
        System.out.println("Testing"); // this does not have anything to do with the if else above

        //else { --> we cannot have just SINGLE ELSE
        //System.out.println("Bye3");

        /* this is correct because even though if doesnpot have {} else with the 2 statements has {} which allows it to have multiple conditions
        if ( 5 > 2)
            System.out.println("Loopcamp);
        else
        { System.out.println("Loopcamp2);
        System.out.println("Loopcamp3); }
         */

        }
    }


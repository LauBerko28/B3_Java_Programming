package day18_loops;

public class ForLoopExample {
    public static void main(String[] args) {

// called forI loop but i can be changed to any name
        for (int i =0;                i <=10;                                   i++){ // shortcut: fori enter
      //     initialization           condition                                iteration
      //     starts the loop          checks(false/true)                       update and go to check the condition again
      //     only happens once        when true execute the code block
      //                                    false ends the code


             /*
               FLow of the FOR LOOP
                1) int i = 0;  --- > initialization [this happens only ONE time]
                2) i <= 10;    --- > termination of condition / checks the boolean condition

                    if TRUE
                        run the  statements in the loop
                    if FALSE
                        loop stops
                3) the loop body statements are executed

                4) i++     ------- > iteration gets updated



                2) termination of condition / checks the boolean condition

                    if TRUE
                        run the statements in the loop
                    if FALSE
                        loop stops
                3) the loop body statements are executed
                4) iteration gets updated

                keep repeating 2, 3, 4 as long as the condition is TRUE
            */

        }


        System.out.println("This is \"fori\" loop");
        for (int z = 0; z <= 10 ; z++) {
            System.out.println(z);
        }


        System.out.println("This is \"while\" loop");
        int z = 0;
        while (z <= 10){
            System.out.println(z);
            z++;
        }


        System.out.println("This is \"do-while\" loop");
        z = 0;
        do{
            System.out.println(z); //
            z++;
        }while(z <= 10);


    }


    }


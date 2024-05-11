package day20_nested_loops;

public class ContinueInNested {
    public static void main(String[] args) {

        //OUTER LOOP
        for (int i = 0; i < 5; i++) {


            if (i == 1) {
                continue;
                // Here, when teh continue is reached, I go to the next ITERATION in OUTER LOOP

            }


            System.out.println("i: " + i);


            // INNER LOOP
            for (int j = 0; j < 3; j++) {


                if (j == 1) {
                    continue;
                    // Here, when teh continue is reached, I go to the next ITERATION in INNER LOOP
                }


                System.out.println("\tj: " + j);
            }


        }


    }
}

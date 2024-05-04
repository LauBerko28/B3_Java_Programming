package day20_nested_loops;

public class BreakinNested {
    public static void main(String[] args) {
        int i = 0;

        // OUTER LOOP
        for ( ; i < 5; i++) {

            System.out.println("i: " + i);

            if (i == 3) {
                break;
            }
            // When the above break statement is run we stop the OUTER LOOP


            // INNER LOOP
            for (int j = 0; j < 2; j++) {

                System.out.println("j: " + j);
                break;
                // When the above break statement is reached, we stop the INNER LOOP

            }
            System.out.println();

        }

        System.out.println("k: " + 5);


        for (int j = 0; j < 5; j++) {
            break;
        }

    }
}

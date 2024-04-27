package day18_loops;

public class Backwards {
    public static void main(String[] args) {


        // can you print the numbers STARTING from 20 and print it until 0[inclusive])
        for (int i = 20; i >= 0; i--) {
            // print each character starting from the last one
        }

        String str = "loop";
        for (int i = str.charAt(str.length() - 1); i >= 0; i--) {

            System.out.println(str.charAt(str.length() - 1));
        }

        // iteration part is not updated  im using 2 on ea h cycle.
        for (int i = str.length() - 1; i >= 0; i -= 2) {
            System.out.println(str.charAt(i)); // p - o
        }

    }

}




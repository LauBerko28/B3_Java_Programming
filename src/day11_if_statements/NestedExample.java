package day11_if_statements;

public class NestedExample {

    public static void main(String[] args) {


        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;


        if (a) {
            System.out.println(1);

            if (b) {// -------------------------> NESTED IF STATEMENT
                System.out.println(3);

            }

            if (d) {// -------------------------> NESTED IF-ELSE STATEMENT
                System.out.println(5);
            } else {
                System.out.println(6);
            }

        } else {

            System.out.println(2);

            if (c) {
                System.out.println(4);
            }
        }


    }



}

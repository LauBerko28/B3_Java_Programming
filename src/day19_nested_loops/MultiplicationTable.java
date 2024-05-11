package day19_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
//OUTER LOOP
        for (int i = 1; i <=10 ; i++) {
//INNER LOOP
            for (int j = 0; j <= 10; j++) {

                System.out.println(i + " x " + j + " = " + (i*j));

            }
            System.out.println();
        }
    }
}

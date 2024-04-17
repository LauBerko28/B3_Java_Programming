package day07_relational_operators;

public class OperatorPractice3 {
    public static void main(String[] args) {
        int t = 100;
       // int p = - ++t * - t-- / t++ + --t; // making it negative makes it a higher priority

        ++t;
        System.out.println(t--);
         // 1: use -> 101
        //  2: update -> 100

        t++;
        System.out.println(--t);
            // 1: update -> 100
            // 2: use ----> 100


        System.out.println( "t: " +  t);
    }
}

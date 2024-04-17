package day07_relational_operators;

public class OperatorPractice4 {
    public static void main(String[] args) {
        int t = 100; // 101 | 100 | 101 | 100

        // p = - 101 *  - 101 / 100 + 100; ----> 10201 / 100 + 100 -----> 102 + 100 = 202
        int p = - ++t * t-- / t++ + --t;

        int c = p % t;

        System.out.println("t: " + t);
        System.out.println("p " + p);
        System.out.println("c: " + c);
    }
}

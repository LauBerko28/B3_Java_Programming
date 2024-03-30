package day06_b_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(x);
        
        x = x +1; // took the value of x, which is 0 and then added 1 to it  --> x= 0 + 1;
        System.out.println(x); // 1

        x++; // POST-INCREMENT - increases it by 1 only.
        System.out.println(x); // 2

        ++x; // PRE-INCREMENT - increases it by only 1.
        System.out.println(x); // 3

        System.out.println(++x); // 4 --> because it is PRE INCREMENT, it will increase it first and then print out and then it can be used
                                 // x = x4
        System.out.println(x++); // 4  --> because it is POST INCREMENT, it'll be used first and then increment
                                 // x=5
        System.out.println(x); // 5

    }
}

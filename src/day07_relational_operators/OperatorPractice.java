package day07_relational_operators;


    public class OperatorPractice {
        public static void main(String[] args) {

            int b = 10;
            b++; // b = b+1; -- POST increment, just standalone statement to increase value by 1.
            System.out.println(b); //1 action: print the value of b
            b--; // b = b-1; -- POST decrement, just standalone statement to decrease value by 1.
            System.out.println(b); //1 action: print the value of b

            System.out.println(b++);//2 actions: print/use and update
            // 1st - use it -- > b=10
            // 2nd - update -- > b=11

            System.out.println(b--); // 11  --- > b = 11 - 1 = 10;
            // 1st - > 11
            // 2nd - > 10

            System.out.println(b);   // 10



        }
    }



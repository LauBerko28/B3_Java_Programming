package day17_loops;

public class DoWhileExample {
    public static void main(String[] args) {
        // This is DO WHILE loop:  which executes the code block first and then checks teh condition for the next iteration

        int a = 0;

        do{
            System.out.println(a); // 0 1 2 3 4 5
            a++; // 1 2 3 4 5 6
        } while (a<=5);

        System.out.println("--------------");

        int a2 = 0;
        do {
            System.out.println(a2); // 0 5 10 15
            a2 += 5; // 5 10 15 20 ( 20 is false so it stops)
            } while (a2 <= 15);

        System.out.println("--------------");

        // this is a while loop:  which checks CONDITION FIRST and based on the result, it executes the code block
        int a3 = 0;
        do{
            System.out.println(a3);
        }while (a3 == 10);




    }
}

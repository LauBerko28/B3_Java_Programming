package day16_loops;

public class HelloWorld {
    public static void main(String[] args) {
        // hey can you print this 5 times.
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("------------");


        // can you print 100 times

        int num = 1;

        while (num <= 100) { // 1 <= 100 -- > true
            System.out.println("Hello World!");
            num++; // num = num + 1;
        }


        System.out.println("-------------");
        int num2 = 97;

        while (num2 <= 100) {
            System.out.println("Hello World!");
            num2++;
        }

        // Infinite loop
//        System.out.println("-------------");
//        while (true) {
//            System.out.println("Hello World!");
//        }



//        System.out.println("-------------");
//        while (false) {
//            System.out.println("Hello World!");
//        }


        System.out.println("-------------");


        int z = 1;

        while (z <= 50 ) {
            System.out.println("Line " + z++);
        }


        System.out.println(z);
    }
}



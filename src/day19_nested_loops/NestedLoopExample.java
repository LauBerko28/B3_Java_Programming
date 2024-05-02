package day19_nested_loops;

public class NestedLoopExample {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }

        System.out.println("Hello Universe");
        System.out.println();


        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }


        System.out.println("Hello Universe");
        System.out.println();


        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }


        System.out.println("Hello Universe");
        System.out.println();

        System.out.println("---------------------------");

        for (int j = 0; j < 3; j++) {

            for (int i = 0; i < 5; i++) {
                System.out.println("Hello World");
            }


            System.out.println("Hello Universe");
            System.out.println();

        }

    }
}
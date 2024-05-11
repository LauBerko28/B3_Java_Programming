package day24_methods;

public class MyFirstMethod {
    // I declared a public static method that returns nothing
    public static void helloWord () {
        System.out.println("Hello World!");
    }


    public static void helloWord50 () {
        for (int i = 0; i < 50; i++) {
            //System.out.println("Hello World!");
            helloWord();
        }
    }


    public static void main(String[] args) {
        System.out.println("Hello World1!");

        helloWord(); // I called the helloWord(); method
        helloWord();
        helloWord();

        System.out.println("Hello World2!");

        System.out.println("----");
        helloWord50();
        helloWord50();
    }




}


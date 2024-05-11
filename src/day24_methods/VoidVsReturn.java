package day24_methods;

public class VoidVsReturn {
    public static void main(String[] args) {

        // when you call the method it does not return anything back and that is why I cannot re-assign anythign like String str = sayHello();
        sayHello();

        sayHello2();

    }

    public static void sayHello(){
        System.out.println("Hello");
    }

    public static String sayHello2() { // this method at the end needs to return a String
        String result = "Hello";
        // return "Hello"; // the returning data has to be the same as the method type
        return result; // is the same as above
    }
}



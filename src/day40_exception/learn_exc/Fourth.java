package day40_exception.learn_exc;

public class Fourth {
    public static void main(String[] args) {

        // the proper way to handle it is as shown below
        try {
            System.out.println("Start");
            // Thread --> class
            // .sleep --> method / I know is static because im calling it by the class
            // this is a compile time exception or checked
            //.sleep gives an error because --> In selenium i need to use try and catch because once the dev make the method, they say hey whoever handles this I want to make sure they have a try and catch to provent some issues
            Thread.sleep(-200); // .sleep will give me an error, because i want to force whoever is using the method to handle it
            // is i provide -200 I get IllegalArgumentException which comes from RunTimeException which is a different issue that what im handling in catch with (InterruptedException e); to handle it I'll use it with the parent class Exception instead to have access to both exception types
            System.out.println("End"); // this one will not show if the first try catches the exception
        } catch (Exception e){ // Exception is the parent class, when i call it like this im pretty much catching everything
            e.printStackTrace();
            // System.out.println(e.getMessage());
        }
        System.out.println("END-2");

    }

    /*
    public static void test() throws InterruptedException { //  this is actually ignoring the exception not handling it --> NOT A GOOD PRACTICE
        Thread.sleep(200);
    }
    */


}

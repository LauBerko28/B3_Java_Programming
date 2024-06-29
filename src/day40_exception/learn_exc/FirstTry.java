package day40_exception.learn_exc;

public class FirstTry {
    public static void main(String[] args) {

        // remember in Java the execution goes from top to bottom left to right
        System.out.println("Fist print out");

        String str = "loopcamp";
        //            01234567
        System.out.println(str.charAt(7)); // --> P
       // System.out.println(str.charAt(8) ); // RUNTIME EXCEPTION --> StringIndexOutOfBoundsException String index out of range: 8 ~~ because there is nothing at the index of 8
        // i need this because there is always a possibility that i get a runtimeException
        // To handle it i can use try and catch
        // i dont know when it'll happen, so im basically making sure that if the exception happens i can handle it
        // If try throws an error, then catch will catch it and the code will continue with the execution. there is not a stop on the code flow
        try{
            System.out.println(str.charAt(8) ); // this is the code that has the possibility of have an exception
        }catch (Exception e){  // Exception is the parent class --> now I have a wider access so
            // System.out.println(e.getMessage()); // String index out of range: 8
            // e.printStackTrace(); // this will give me a detail explanation of what the issue was
            // if the exception in the consol is part of parent class "Exception" then cathc it
             System.out.println("Exception is caught");
        }


        System.out.println("Last print out");
    }
}

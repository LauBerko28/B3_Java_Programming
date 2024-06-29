package day40_exception.throws_keyword;

public class UsingThrow {
    public static void main(String[] args) throws InterruptedException { // throws InterruptedException which basically ignores the method

        Thread.sleep(200); // compile Exception + possible rUNtIMEeXCEPTION
        // if i dont have the throws in the main method I MUST handle the .sleep() compile exception with a try/catch

        // If I dont want to handle the COMPILE exception - I have a chance to AVOID it
        // I can add the exception into method signature
        test(); // Since we are also ignoring it by main method signature we are not required to handle COMPILE TIME EXCEPTION here

    }

    // here i created a custom method that also ignores the compile error
    // ignoring is saying for now im ignoring it, but when im trying to use it somewhere else Im forcing people to deal with it
    public static void test() throws InterruptedException {
        Thread.sleep(200);
    }

    // if i actually want to handle it:

    public static void test2(){
        try{
            test();
        } catch (Exception e){

        }
    }

    public static void test3 () {
        test2();
    }
}

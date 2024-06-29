package day38_a_abstraction_interface.interface_methods;

public interface Mac {
    // in interface i can have 4 thinds
    //Everything in interface has "public" access modifiers


    // #1 - public static final variables - CONSTANTS that must be initialized
    String NAME = "MAC";  // public static final
    String OS = "iOS";

    // #2 - abstract methods
    void turnOn(); // public abstract

    // Q: How can I have a method in interface with BODY / CODE BLOCK
    // A: 2 options - 1) static method, 2) default method

    // #3 -1) - static method
    public static void company(){
        System.out.println("Apple");
        System.out.println("HQ is in LAX");
        System.out.println("New release is normally in September");
    }

    //#4 - 2) - default method
    // default here is NOT ACCESS MODIFIER
    default void faceTime(){
        System.out.println("Opening FaceTime");
        System.out.println("Calling someone");
    }
}

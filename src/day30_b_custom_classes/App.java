package day30_b_custom_classes;

public class App {

    //These are INSTANCE VARIABLES / DATA MEMBERS
    //These are not part of a method, they are directly in the class level
    //If variables are declared in methods, they are called LOCAL VARIABLES
    String name;
    Double version;
    boolean isFree;


    // creating a class without static, and my method name is "run"
    // The below method is an INSTANCE METHOD - does not have the "static" keyword
    // has a return type of void
    // Each object will run as it is its own version
    // Since .run() method is an INSTANCE method, i cannot call it by the class name, we must call it by the object/object reference
    public void run (){
        System.out.println(name + " is running.");

    }

    public void update () {
        System.out.println(name + " is updating....");
        version += 1.1; // in real life everytime i have an app update, the version changes, for that reason i update within this method to always add the 1.1   --> VERSION comes from my INSTANCE VARIABLE App class
    }


}


package day30_b_custom_classes;

public class UsingApp {
    public static void main(String[] args) {

        // System.out.println(name); --> NOT VALID
        // How can i create the object of the class? --> className + ObjectReferenceName = new + className ();

        App app1 = new App(); // app1 has its own version/copies of name, version and is free

        System.out.println(app1.version);// result is 0.0 because no value has been assigned to it yet

        App app2 = new App(); // app2 has its own version/copies of name, verion and is free


        app1.name = "loopcamp"; // here im assigning values to the variables
        app1.version = 2.0;
        app1.isFree = false;

        System.out.println(app1.name); //loopcamp
        System.out.println(app1.version); //2.0
        System.out.println(app1.isFree); // false

       // App.run(); --> NOT VALID - since .run method is an instance method we cannot call it by className

        // How can i call an INSTANCE METHOD? --> by the OBJECT TYPE
        app1.run(); // loopcamp is running.
        app1.update(); // loopcamp is updating.... --> DOES NOT need a print statement


        // Here im assigning values to instance variables
        app2.name = "game";
        app2.version = 1.4;
        app2.isFree = true;


        // from class App i have now 2 objects (app1 and app2 )
        System.out.println("*************");
        // Here im calling INSTANCE METHODS for app2, and app2 is an object of the class
        app2.run();  // game is running.
         /*
        it is calling the below INSTANCE METHOD and pass the information from the object type i assigned for app2.name = "game" to the INSTANCE METHOD
        public void run (){
        System.out.println(name + " is running.");}
         */
        app2.update(); // game is updating....
                       // 2.5
        /*
        it is calling the below INSTANCE METHOD and pass the information from the object type i assigned for app2.name = "game" to the INSTANCE METHOD
        public void update () {
        System.out.println(name + " is updating....");

        ---AND---

        version += 1.1; which also comes from my instance method update, and it is basically updating to a newer version of the app everytime
        */

        System.out.println("******************");

        System.out.println(app1.version);  // initial version for app1 = 2.0 before i called the update, once i call my app1.version, it jumps to the INSTANCE METHOD "update" to update the value everytime increasing it by 1.1, my new version will be = 3.1
        System.out.println(app2.version);  // initial version for app1 = 1.4 before i called the update, once i call my app1.version, it jumps to the  INSTANCE METHOD "update" to update the value everytime increasing it by 1.1, my new version will be = 2.5


        System.out.println("Without using the updated Instance method");
        System.out.println(app1.version); // since i havent called the INSTANCE METHOD to update it yet. the version remains the same as last used 3.1
        System.out.println(app2.version); // since i havent called the INSTANCE METHOD to update it yet. the version remains the same as last used 1.1

        System.out.println("After using the updated Instance method");
        app1.update(); // instance method is called by the object

        System.out.println(app1.version); // it went to the instance method first and updated on 1.1 the version (3.1) and then it printed it, so now my version is 4.2

        System.out.println(app2.version); // as i have not called the instance method for app2 the version remains the same 2.5


        System.out.println("******************");

        new App().run(); // Here i created a new object with reference, it took the information from my object type from App class, and went inside the .run() instance method, from there it printed, but as no value is yet assigned to the Instance variables then it'll print --> null is running.
        /*
        public void run (){
        System.out.println(name + " is running.");}
        name will give me its default value of null
         */

        new App().name = "Racecar";
        System.out.println(new App().name);// null --> this is a new object and it doesnt have a reference to it






    }
}

package day37_a_abstraction.book;

public interface Create {
   //if something is final, it has to be given value
   // variables in interface are "static final" --> CONSTANTS (final cannot change the value)
    // in interface i can access to abstract methods

   String NAME = "Test"; // public static final String NAME = "Test"; --> i dont need to add the public static bc intellij knows that by default interface is always static final

    // this is an abstract method as it does not have a body
   void read(); // --> public abstract void read();
    // this is an abstract method as it does not have a body
   void write(); // --> any method made in interface with NO ACCESS MODIFIERS is public abstract


}

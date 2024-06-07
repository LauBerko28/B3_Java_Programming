package day35_inheritance.recap.computer;

import day21_arrays.SumUpElements;

//this is a child and sibling class
public class Windows extends Computer{

    String edgeVersion;

    // CREATING A CONSTRUCTOR FOR WINDOWS
    // I can have a constructor in the child and wont be available in the parent
    public Windows(String os, int memory) {

        super(os, memory); // calling explicitely the parent constructor class

       // super.os = os; // I can do this one here because this class has a copy of its parent - by inheritance
        // when your child class has same instance variable name AND same instance var name is available in your parent class
        // if you want to make a difference between the instance variable from the child and local class

       // this.os --> refers to its own clas
        this.memory = memory;
    }

 // when i use  super() is because i have the exact same naming for instance methods in the parent and child classes

        // new Windows ("Windows", 512, "3.4"
    public Windows(String os, int memory, String edgeVersion){
        super(os, memory);// this one is coming from the parent class
        // this(os, memory); --> i can also do this because it comes --> this("Windows", 512)
        this.edgeVersion = edgeVersion;

    }

    // when I have a constructor on the parent class I must use a super() on the child class to explicitly accept the methods from the parent class

}

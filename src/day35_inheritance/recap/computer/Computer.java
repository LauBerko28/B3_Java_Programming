package day35_inheritance.recap.computer;
// This one will be my parent class
public class Computer {

    String os;
    int memory;

    // CREATING A CONSTRUCTOR FOR INSTANCE VAR

    // Whenever i
    // hEY YOUR PARENT TAKES SOMETHING AND THIS IS ALSO AVAILABLE IN THE PARENT, BUT VICEVERSA IS NOT APPLICABLE (WHATS ON THE CHILD IS NOT ON THE CHILD)

    public Computer(String os, int memory) {
        this.os = os;
        this.memory = memory;
    }

    /*IF YOU HAVE A DEFAULT CONTRUCTOR IN THE PARENT, THE CHILD CLASS WILL ALWAYS HAVE AN IMPLICIT SUPER() CONSTRUCTOR
    public Computer() {
        this.os = os;
        this.memory = memory;
    }
    */


}

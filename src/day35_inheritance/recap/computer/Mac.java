package day35_inheritance.recap.computer;
//this is a child and sibling class
public class Mac extends Computer {

    String safariVersion;


     //CREATING A CONSTRUCTOR FOR MAC
    // I can have a constructor in the child and wont be available in the parent
    public Mac(String os, int memory) {

        super(os, memory);
        //super.os = os; //  I can do this because os is also available at the parent level
        this.memory = memory;


    }

    public Mac(String os, int memory, String safariVersion) {
super(os, memory);
this.safariVersion = safariVersion;
    }

}

package day32_custom_classes;

public class ChainExample {
    public ChainExample (){
        System.out.println("First");
    } // First


    public ChainExample (int i){
        this(); // pointing at another constructor method that matches the () so its print
        // always has to be on the first line
        System.out.println("Second");
        /*
            First
            Second
         */
    }

    public ChainExample (String str){
        this (4);
        System.out.println("Third");
        /*
            First
            Second
            Third
         */
    }


    public ChainExample (double d){
        this();
        System.out.println("Fourth");
        /*
            First
            Fourth
         */
    }
}

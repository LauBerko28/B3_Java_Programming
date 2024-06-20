package day40_exception.person;

public class UsingPerson {
    public static void main(String[] args) {

        Person obj = new Person(); // here i used default constructor

        // the purpose of this one is for the runtime exception from the setName method under Person class
        // even if i ignore it on the main method signature, when i go to run it i will
        try {
            obj.setName("John"); // with this method i can set the name --> i can either ignore it or handle it
        }catch (Exception e){
            System.out.println(e.getMessage()); // the purpose of this one is that whenever an error happens i want to see the message

        }
        System.out.println(obj.getName()); // John

        try {
            obj.setAge(130); // i need to handle it otherwise will get a runtime exception
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Bye");


    }
}

package day37_a_abstraction.book;

public class Runner {
    public static void main(String[] args) {

        // Create obj = new Create() --> CANNOT create the object of interface

        Book obj2 = new Book(); // I can create an object of this because is a class
        obj2.read();
        obj2.write();
        System.out.println(obj2.NAME);
    }
}

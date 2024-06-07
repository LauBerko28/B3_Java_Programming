package day35_inheritance.recap.book;

public class Library {
    public static void main(String[] args) {


        Book b1 = new Book();
        // b1. - has access to 5 members of the class // instance variables (before we added the Author variable

        AudioBook a1 = new AudioBook();
       //a1. - has access to 7 instance variables (5 from parent + 2 from itslef), and 1 instance method from itself

        a1.duration = 100;
        a1.narrator = "Morgan Freeman";
        a1.listen(); // here im calling the instance method
        a1.title = "Java is Fun ";


        EBook e1 = new EBook();
        //e1. - has access to 7 instance variables (5 from parent + 2 from itslef), and 1 instance method from itself

       // e1.duration =100; --> INVALID because .duration belongs to a sibling class
        e1.size = 10;
        e1.pages = 600;
        e1.title ="Soft Skills";
        e1.read();
        //e1.listen() --> INVALID because .listen() belongs to a sibling class

        // Here im creating an object of the Author class
       Author author1 = new Author("jojo moyes", 40);
        Book book1 = new Book();
              //  book1. has access to 6 instance variables
        book1.author= new Author("Gabriel Garcia Marquez",80);
        System.out.println(book1.author); // without the toString i'll get a memory location

        AudioBook audio1 = new AudioBook();
        audio1.author = new Author("Thomas Jefferson", 70); // i can do this because Author is part of the parent class and AudioBook is its child therefore i also have access to those instance variables and instance methods

        // how can i print only the name
        System.out.println( audio1.author.getName() );

    }
}

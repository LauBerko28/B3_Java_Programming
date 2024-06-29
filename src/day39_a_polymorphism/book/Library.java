package day39_a_polymorphism.book;

import day36_inheritance.static_hide.B;
import day38_b_polymorphism.animal.Animal;

public class Library {
    public static void main(String[] args) {
        // left side is my reference
        JAvaTextBook book1 = new JAvaTextBook();
        book1.name = "JAVA OCA"; // i can access it due to inheritance
        book1.size = 30.0;
        book1.isFun = true;
        book1.read();
        book1.open();
        book1.download();

        EBook book2 = new JAvaTextBook();
        book2.name = "JAVA OCA"; // i can access it due to inheritance
        book2.size = 30.0;
        // book2.isFun = true; --> Ebook does not have access to itsFun variable
        // if i want to have access i need to do casting and then reach it
        ((JAvaTextBook)book2).isFun = true; // after downcasting to the class JavaTextBook which has access to isFUn, I am able to reach it
        book2.read();
        book2.open();
        book2.download();

        Book book3 = new JAvaTextBook();
        book3.name = "JAVA OCA"; // i can access it due to inheritance
       // book3.size = 30.0;
        ((JAvaTextBook)book3).size = 20.0;
        ((EBook)book3).size = 20.0;
        // book2.isFun = true; --> Ebook does not have access to itsFun variable
        // if i want to have access i need to do casting and then reach it
        ((JAvaTextBook)book3).isFun = true; // after downcasting to the class JavaTextBook which has access to isFUn, I am able to reach it
        book3.read();
        // book3.open();
        ((JAvaTextBook)book3).open();
       //book3.download();
        ((JAvaTextBook)book3).download();

        Dowloadable book4 = new JAvaTextBook();
        // book4.name = "JAVA OCA";
        ((JAvaTextBook)book4).name = "JAVA OCA";
        ((JAvaTextBook)book4).size = 30.0;
        //book4.size = 30.0;
        ((JAvaTextBook)book4).isFun = true;
        // book4.isFun = true;
        //book4.read();
        ((JAvaTextBook)book4).read();
        //book4.open();
        ((JAvaTextBook)book4).open();
        book4.download();

        System.out.println("----------");
        System.out.println(book1 instanceof JAvaTextBook); // true
        System.out.println(book2 instanceof JAvaTextBook); // true
        System.out.println(book2 instanceof EBook); // true
        System.out.println(book2 instanceof Book); // true
        System.out.println(book4 instanceof JAvaTextBook); // true
        System.out.println(book4 instanceof Animal); // false


    }
}

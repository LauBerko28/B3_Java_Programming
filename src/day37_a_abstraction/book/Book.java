package day37_a_abstraction.book;
// to access stuff from the class Interface use keyword implements
public class Book implements Create {

    @Override
    public void read() {
        System.out.println("Reading the book");

    }

    @Override
    public void write() {
        System.out.println("Writing the book");
    }
}

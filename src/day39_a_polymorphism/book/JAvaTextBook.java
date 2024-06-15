package day39_a_polymorphism.book;

public class JAvaTextBook extends EBook {

    boolean isFun;

    @Override
    public void open() {
        System.out.println("Opening Java text book");
    }

    @Override
    public void read() {
        System.out.println("reading JAvaTextBook");
    }

    @Override
    public void download() {
        System.out.println("downloading JAvaTextBook");
    }
}

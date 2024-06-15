package day39_a_polymorphism.book;

public abstract class EBook extends Book implements Dowloadable{

    double size;
    public abstract void open();
}

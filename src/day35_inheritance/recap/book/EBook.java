package day35_inheritance.recap.book;

public class EBook extends Book {
    double size;
    int pages;

    public void read (){
        System.out.println("reading a digital copy of " + title);
    }


}

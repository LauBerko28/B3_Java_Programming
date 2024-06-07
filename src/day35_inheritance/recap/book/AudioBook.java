package day35_inheritance.recap.book;

public class AudioBook extends Book {
    double duration; // 30min long
    String narrator;

    // HERE I HAVE ADDED A VARIABLE FROM THE PARENT AND ONE FROM THE CHILD
    public void listen(){
        System.out.println("listening to " + title + " narrated by " + narrator);
    }





}

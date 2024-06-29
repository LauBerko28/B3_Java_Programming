package day42_a_collection.iterate;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Jerry");
        names.add("Mickey");
        names.add("Mouse");
        System.out.println(names); // [Tom, Jerry, Mickey, Mouse]

        // To be able to use Iterator, I need to first declare Iterator
        //                          where im going to iterate through
        Iterator<String> iterator = names.iterator();
       //  Iterator<String> iterator = names.(new Itr()); the method .iterator returns object of Itr class-- > new Itr();


        System.out.println(iterator.next()); // Tom --> move the cursor /pin, and return the element
        System.out.println(iterator.next()); // Jerry --> cursor will mvoe to the next element and will return me this element
        System.out.println(iterator.next()); // Mickey --> cursor will mvoe to the next element and will return me this element
        System.out.println(iterator.next()); // Mouse --> cursor will mvoe to the next element and will return me this element
       //  System.out.println(iterator.next());  NoSuchElementException --> there is no next element to iterate through



    }
}

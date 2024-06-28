package day44_map_and_functions.string_builder_buffer;

public class StringStringBuilderStringBuffer {
    public static void main(String[] args) {

        //1. String Class
        //   String are IMMUTABLE - we cannot change
        String str1 = "loopcamp";                        // literals --> stored in String pool in Heap
        String str2 = new String("loopcamp");    // stored directly in the Heap
        str1 = str1 + str2;                             // IMMUTABLE here what i do is create a brand new space in the heap for str1

        //2. StringBuilder Class
        //   It is in java.lang package
        //   **MUTABLE** - once object is created, we still can change the SAME object
        //   It is NOT synchronized
        //   It can ONLY be created using "new" keyword
        StringBuilder str3 = new StringBuilder("loopcamp"); // stored directly in the Heap
        System.out.println(str3); // loopcamp
        str3.append(" course"); // --> this is adding something to the original calue
        System.out.println(str3);  // loopcamp course

        //3. StringBuffer Class
        //   It is in java.lang package
        //   **MUTABLE** - once object is created, we still can change the SAME object
        //   It is synchronized
        //   It can ONLY be created using "new" keyword
        StringBuffer str4 = new StringBuffer("loopcamp");
        System.out.println(str4); // loopcamp
        str4.reverse();
        System.out.println(str4);  // pmacpool
        str4.append(4);
        System.out.println(str4);

    }
}

package day08_scanner_logical_operators;

public class OrPractice {
    public static void main (String []args ){
        int apple = 5;
        int oranges = 10;

        System.out.println(apple > 1 || oranges < 5); // can be used with non-related things ~ since this is || and FIRST part is true, I actually do not need to check the 2nd side.
        //                 true || false              // Because, only false || false can give false
        //                 true

        System.out.println( apple > 10 || oranges == 10);
        //                  false || true
        //                       true

        System.out.println(apple > 10 && oranges == 10); // since this is && and FIRST part is false, I actually do not need to check the 2nd side.
                                                        // Because, only true && true can give true
        //                  false && true
        //                      false



    }
}

package day44_map_and_functions.functions;

public class UsingDynamicInterface {
    public static void main(String[] args) {
        // DynamicInterface <> --> same as DynamicInterface <T> : now i can provide any dataType that i want
        // printEachChar : this is the name of the implementation
        // -> {} : actual implementation
        DynamicInterface <String> printEachChar = ( str ) -> {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }

        };

        printEachChar.test("loopcamp");

        DynamicInterface<Integer> printNumber5Times = ( n ) -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(n);
            }
        };
         printNumber5Times.test(7); // here will print 7 five times

    }
}

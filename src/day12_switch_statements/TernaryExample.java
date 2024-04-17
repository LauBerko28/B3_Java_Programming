package day12_switch_statements;

public class TernaryExample {
    public static void main(String[] args) {

        String result = (5 > 9) ? "Loopcamp" : ( 4 < 2) ? "Hello" : (5 == 5 ) ? "Test1" : "Test2" ;


        // String result = (5 > 9) ? "Loopcamp" : ( 4 < 2) ? "Hello" : "Test1";


        // String result = (5 > 9) ? "Loopcamp" : "Test1";

        //String result = (5 > 9) ? "Loopcamp" :   "Bye";




        System.out.println(result);

    }
}
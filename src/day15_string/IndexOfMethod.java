package day15_string;

public class IndexOfMethod {
    public static void main(String[] args) {
        String s = "penpen";
        //          012345
        System.out.println( s.indexOf("p")); // 0
        System.out.println( s.indexOf('p')); // 0 --> not so used
        System.out.println( s.indexOf("pe")); // 0 --> searches for the same match thats why is only 0 and not 01

        System.out.println("**************");

        System.out.println( s.indexOf("e")); // 1
        System.out.println( s.indexOf('e')); // 1

        System.out.println("**************");

        System.out.println( s.indexOf("n")); // 2
        System.out.println( s.indexOf('n')); // 2

        System.out.println("**************");
        System.out.println(s.indexOf('x')); // -1 because it is saying that it doesnot exist
        System.out.println(s.indexOf("x"));
        System.out.println(s.indexOf("pem"));
        System.out.println(s.indexOf("PEN")); // CASE SENSITIVE SO THIS WILL ALSO PRINT -1


        System.out.println("**************");
        System.out.println(s.indexOf('p', 4)); // -1 --> im telling intellij to find the index of p but starting from index of 4
        System.out.println(s.indexOf("pe",1)); // 3

        System.out.println(s.indexOf("pn")); // -1  because even though I have a p, there is not pn

        System.out.println(s.indexOf("pe",6)); // -1 ** this will not give EXCEPTION, it will just say that there is not MATCHING with -1


    }
}

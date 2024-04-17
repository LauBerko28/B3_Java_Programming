package day07_relational_operators;

public class RelationalOperatorExample {
    public static void main ( String []args ){
        System.out.println(10 > 5); // since only can hold true and false, it will be hold on boolean
        System.out.println(10 < 5); //

        int a = 5;
        int b = 3;

        System.out.println(a > b);
        boolean aAndB = a < b;
        System.out.println(aAndB);

        System.out.println(6 >= 6); // true
        System.out.println(6 <= 6); // true

        System.out.println(4==4); // this is comparing if it is equal
        System.out.println(4 != 4); // != this is NOT EQUAL

        System.out.println(3 != 1); //  3 is not equal to 1

    }
}

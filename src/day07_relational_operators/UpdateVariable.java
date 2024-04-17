package day07_relational_operators;

public class UpdateVariable {
    public static void main(String[] args) {
        int a = 10;
        a = 11; // re-assigned a new value to a
        a++;    // re- assigning [a = a+1] --> re-assigned a new value which is increased by 1 (POST INCREMENT)
        ++a;    // re- assigning [a = a+1] --> re-assigned a new value which is increased by 1 (PRE INCREMENT)
        a = a + 1; // re- assigning [a = a+1] --> re-assigned a new value which is increased by 1 (REGULAR ADDING 1)


        // add 10
        a = a + 10; // re-assigned a new value which increased by 10 (regular adding 10)
        a += 10;    // re-assigned a new value which increased by 10 (SHORTHAND operator)

        System.out.println(a);

        int b = 2;
        b*=6; // b = b * 6; --> b = 2 * 6; ---> b = 12
        System.out.println(b);

        int c = 10; // c = c % 3; --> c = 10 % 3: ---> c = 1;
        c %= 3;
        System.out.println(c);


    }
}

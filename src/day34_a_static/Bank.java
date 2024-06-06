package day34_a_static;

public class Bank {
    public static void main(String[] args) {

        System.out.println(DebitCard.accountType); // first see the static block because I invocked the class first "DebitCard" then the
        DebitCard db1 = new DebitCard(1234567890123456L, "Mikey Mouse", 10000);
        System.out.println(db1);


        //Create multiple object also with INVALID inputs.
        DebitCard db2 = new DebitCard(1234567890L, "Mikey Mouse", 10000);
        System.out.println(db2);

        DebitCard db3 = new DebitCard(1234567890L, "Mikey Mouse", "Amex", 12345, 1000000);
        System.out.println(db3);



    }
}

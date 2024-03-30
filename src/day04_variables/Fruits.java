package day04_variables;

public class Fruits {

    public static void main (String []args){

        int apples = 70;
        int grapes = 100;
        int bananas = 150;

        System.out.println("This is how many apples we have: " + 70); // the value 70 is HARDCODED
        System.out.println("This is how many apples we have: " + apples); // the value of apple is DYNAMICALLY used
        System.out.println("Grapes:" + grapes); // if I want a space on the statement then I added on the string
        System.out.println("Bananas:"+ bananas);


        //REASSIGMENT
        System.out.println("Sold out some apples");
        apples = 30; // I reassigned container called apples to hold 30
        System.out.println( "Apples after selling: "+apples);

        int price = 15;
        System.out.println("The price of my 30 apples is $20");// IT IS HARDCODED

        System.out.println("The price of my " + apples + " apple is $" + price);











        System.out.println(50 + 50);
        //Anything after FIRST string is a CONCATENATION
        System.out.println("50"+50); // will read as 5050 this is a CONCATENATION
        System.out.println(10+10+"10"+10); // will read as 201010

    }
}

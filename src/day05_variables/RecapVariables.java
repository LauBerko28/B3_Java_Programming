package day05_variables;

/*    int num1 = 5;
    num1 = 4;
    int num2 = 7;
        System.out.println(num1);  // 4
    num2 = num1;
        System.out.println(num2);  // 4

        System.out.println("" + 3+3 + "1234" + 5); // 3312345
        System.out.println(1234);   //1239

        System.out.println(" ");
        System.out.println("");

    byte n = 4;
        System.out.println(n + 2);*\

 */

public class RecapVariables {
    public static void main (String [ ]args ) {

        //Declare variables

        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalNumberOfStudentsInClass;


// we cannot use the variables because they don't have a value yet
        //System.out.println(int);
        //System.out.println(numberOfCoffeeCups);


        //Assign values
        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 10.25;
        totalNumberOfStudentsInClass = 100;

        // print out like this: 2 * 100 - $numberOfCoffeeCups * $totalNumberOfStudentsInClass
        // we used concatenation to print out the values of two variables in a given format
        System.out.println(numberOfCoffeeCups + " * " + totalNumberOfStudentsInClass);


        //Declare and assign
        double temperature = 30.5;
        int javaDay = 5;
        System.out.println("\nToday the temperature was " + temperature);
        System.out.println("It is Day " + javaDay + " in Java class.");


        /*     NAMING VARIABLES
            hell1@ - can not have any special characters other than $ _ digit

            12test - Cannot start with numbers

            $public - we can start with $

            _34hello - we can start with _

            staticTest - valid

            static - not valid. It is java reserved word

            Package - valid because it starts with capital P however not recommended because not following camelCase pattern
         */



} }

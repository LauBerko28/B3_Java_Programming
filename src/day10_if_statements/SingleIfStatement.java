package day10_if_statements;

public class SingleIfStatement {

    public static void main (String []args){
        if (false) {
            System.out.println("Hello World!"); // Since condition is FALSE, the code block belongs to if statement will not be EXECUTED
        }
        System.out.println("Second Print Statement");

        if (true) {
            System.out.println("Today is Wednesday");

        }

        int score = 60;
        if (score >= 75){
            System.out.println("passing the exam");
        }

        if (score < 75 ){
            System.out.println("Failing the exam");
        }

        int year = 2021;
        boolean isLockdown = year == 2020 || year ==2021;

        if (isLockdown){
            System.out.println("Stay at home");
            System.out.println("practice CODING");
        }
            }

}

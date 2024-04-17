package day10_if_statements;

public class IfElseExample {

    public static void main(String[] args) {
/*
        int score = 75;

        if (score >= 75) {
            System.out.println("passing the exam!");
        }

        if (score < 75) {
            System.out.println("Failing the exam!");
        }
*/
     int score = 75;

     if (score >= 75){
         System.out.println("passing the exam!");
     }else { System.out.println("Failing the exam!");

     }

     // if score > 90 --> print exellent else print keep working

        if (score > 90){
            System.out.println("Exellent");
        }else {
            System.out.println("Keep working");
        }

        // what happens if score is == 90 -> keep working
        // what happens if score < 90 -> keep working


        int year = 2029;
        boolean isLockdown = year == 2020 || year ==2021;

        if (isLockdown){
            System.out.println("Stay at home");
            System.out.println("practice CODING");
        } else {
        System.out.println("Go outside");
        System.out.println("Meet with friends");
    }
    }
    }

package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        String [] student1 = {"AB001", "Tom" , "Jerry", "B#03"};
        //                       0        1       2        3
        //                      ID#     NAME    LAST N     BATCH#

        System.out.println(Arrays.toString(student1));

        String [] student2 = new String[4]; // the defauls value for String is NULL which means that if one of the spaces is missing information it'll print NULL in the consol
        student2[1] = "Winnie";
        student2[3] = "B#02";
        student2[0] = "AB002";
        student2[2] = "Pooh";
        System.out.println(Arrays.toString(student2));

        String [] student3 = new String[4];
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your ID: ");
        student3[0] = key.nextLine();

        System.out.print("Enter your first name: ");
        student3[1] = key.nextLine();

        System.out.print("Enter your last name: ");
        student3[2] = key.nextLine();

        System.out.print("Enter you Batch Number: ");
        student3[3] = key.nextLine();

        System.out.println(Arrays.toString(student3));


        System.out.println("--------------------");

        String [] questions = {"Enter your ID: ", "Enter your first name: ", "Enter your last name: ", "Enter you Batch Number: "};
        String [] student4 = new String[4];
        // here im using 2 arrays so i have to make sure both of them


        for (int i = 0; i < questions.length; i++) {

            System.out.print(questions[i]);
            student4[i] = key.nextLine();

        }
        System.out.println(Arrays.toString(student4));



    }
}

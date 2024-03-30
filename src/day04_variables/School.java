package day04_variables;
/*
    Task:

    class name: School

    declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school (3.5) [ranges 1.0 - 4.0]

    print all of the variables with unique messages

*/
public class School {
    public static void main(String[] args) {
        int numberOfStudentsInGrade1 = 40;
        int numberOfStudentsInGrade2 = 25;
        int numberOfStudentsInGrade3 = 34;
        int numberOfStudentsInGrade4 = 19;
        int numberOfStudentsInGrade5 = 28;
        int totalNumberOfStudents = numberOfStudentsInGrade1 + numberOfStudentsInGrade2 + numberOfStudentsInGrade3 + numberOfStudentsInGrade4 +
                numberOfStudentsInGrade5; //146

        double numberOfSchoolDays = 100.5;
        double numberOfSnowDays = 5.5;
        double averageGPAInSchool = 3.5;

        System.out.println("Number of students in grade 1: " + numberOfStudentsInGrade1);
        System.out.println("Number of students in grade 2: " + numberOfStudentsInGrade2);
        System.out.println("Number of students in grade 3: " + numberOfStudentsInGrade3);
        System.out.println("Number of students in grade 4: " + numberOfStudentsInGrade4);
        System.out.println("Number of students in grade 5: " + numberOfStudentsInGrade5);

        System.out.println("Total number of students: \t " + totalNumberOfStudents);

        System.out.println("Number of School days: \t\t" + numberOfSchoolDays);

        System.out.println("number of snow days: \t\t" + numberOfSnowDays);

        System.out.println("Average GPA in school: \t\t " + averageGPAInSchool);





    }
}

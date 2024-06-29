package day33_a_static;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {

       // LoopCampStudent student1 = new LoopCampStudent(); created an object and its calling the defasult constructor of LoopCampStudent class

        LoopCampStudent student1 = new LoopCampStudent("Elina", 3);
        System.out.println(student1);

        LoopCampStudent student2 = new LoopCampStudent("Aygun", 3);
        System.out.println(student2);

        /*
        ==> this part is calling the static method that only prints once
        School Name: Loopcamp
                    Batch Number 3
                    Teachers: [Nadir, Feyruz, James, Diana]
        LoopCamp Student Info
	                Name: Elina
	                Group Number: 3
        LoopCamp Student Info
	                Name: Aygun
	                Group Number: 3
         */

        System.out.println();
        LoopCampStudent.printInfo();

        /*
        School Name: Loopcamp
        Batch Number 3
        Teachers: [Nadir, Feyruz, James, Diana]
         */


        // can you get me the names of the teachers
        System.out.println("LoopCamp teachers: ");
        System.out.println(Arrays.toString(LoopCampStudent.teachers));
        /*
        LoopCamp teachers:
        [Nadir, Feyruz, James, Diana]
         */

        // i can also get to them by looping
        int i = 0; // this will be used to give me the teacher#
        for (String each : LoopCampStudent.teachers){
            System.out.println("Teacher " + ++i + ": " +each);
            /*
            Teacher 1: Nadir
            Teacher 2: Feyruz
            Teacher 3: James
            Teacher 4: Diana
             */
        }
    }
}

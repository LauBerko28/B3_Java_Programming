package day33_a_static;

import java.util.Arrays;

public class LoopCampStudent {

        String name;
        int groupNumber;

        static int batchNumber;
        static String [] teachers; // this is adding different teachers to a container
        static String schoolName;

        // CREATING STATIC BLOCK
        static {
            batchNumber =3;
            teachers = new String[]{ "Nadir", "Feyruz", "James", "Diana"};
            schoolName = "Loopcamp";
            printInfo(); // calling printInfo() static method
            // needs to be loaded

        }

        // here im creating a custom method
        public static void printInfo(){
            System.out.println("School Name: " + schoolName);
            System.out.println("Batch Number " + batchNumber);
            System.out.println("Teachers: " + Arrays.toString(teachers));
           // System.out.println("Name: " + name); --> we CANNOT use instance in static

        }

        // creating a constructor
    public LoopCampStudent (String name, int groupNumber){
            this.name = name;
           this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "LoopCamp Student Info" +
                "\n\tName: " + name +
                "\n\tGroup Number: " + groupNumber;
    }
}

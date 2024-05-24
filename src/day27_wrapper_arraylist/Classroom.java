package day27_wrapper_arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<String> groupTwo = new ArrayList<>();
        groupTwo.add("Laura");
        groupTwo.add("Jeyhun");
        groupTwo.add("Andrew");
        groupTwo.add("Alex");
        groupTwo.add("Ayaz");

        ArrayList<String> groupThree = new ArrayList<>();
        groupThree.add("Anna");
        groupThree.add("Gedi");
        groupThree.add("Kennan");
        groupThree.add("Sammy");

        System.out.println();
        System.out.println("First Student from group 2: " + groupTwo.get(0));
        System.out.println("First Student from group 3: " + groupThree.get(0));


        System.out.println();
        System.out.println("Last Student from group 2: " + groupTwo.get(groupTwo.size()-1));
        System.out.println("Last Student from group 3: " + groupThree.get(groupThree.size()-1));


        System.out.println();

        for (int i = 0; i < groupTwo.size(); i++) {

            System.out.println("Group two student " + (i+1) + " " + groupTwo.get(i)); //  (i+1) --> tells me the student numnber starting from 1, if i did only i it'll give me 0 as the student#

        }

        System.out.println();
        int counter =1;
        for (String each : groupThree){
            System.out.println("Group three student " + counter++ + " " + each);
             // System.out.println("Student: " + each);

        }

    }
}

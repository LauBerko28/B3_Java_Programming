package day43_a_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {
    public static void main(String[] args) {
        /*
        DataBase Table: People

            FIRST_NAME | LAST_NAME | BATCH NO   < ----- column names
            Andrew     |  Lana         |    3   < ----- data rows
            Jeyhun     |  Mammadov     |    3
            Laura      |  Berkowitz    |    3
            Anna       |  Nicol        |    3


         */
        // How can i make a Map that will hold all my table infoirmation?

        Map<String, String > student1 = new HashMap<>() ;
        student1.put("FIRST_NAME", "Andrew");
        student1.put("LAST_NAME", "Lana");
        student1.put("BATCH NO" , "3");
        System.out.println(student1); //  {LAST_NAME=Lana, BATCH NO=3, FIRST_NAME=Andrew}

        // make a reusable method that accepts info about a student and adds it into a Map and returns it
        Map <String, String>student2 = makeMAp("Jeyhun","Mammadov", "3");
        Map <String, String>student3 = makeMAp("Laura","Berkowitz", "3");

        List<Map<String, String>> listOfStudents = new ArrayList<>(); // here im justa adding all the maps to one big container List in this case
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        listOfStudents.add(student3);
        listOfStudents.add(makeMAp("James","bond", "2")); // calling a method that returns map and Im passing the values here directly
        listOfStudents.add(makeMAp("Tom","Jerry", "2"));
        listOfStudents.add(makeMAp("Winnie","Pooh", "1"));
        listOfStudents.add(makeMAp("Tom","Jerry", "1"));

        // can you get me th last name of the second student
        System.out.println( listOfStudents.get(1).get("LAST_NAME") ); // this will get me the map at the index of 1 | then get the value assigned to LAST_NAME
        System.out.println( listOfStudents.get(1).get("FIRST_NAME") ); // .get(1) --> student2 is at the index 1 on the List, and from the same get me the FIRST_NAME
        System.out.println( listOfStudents.get(1).get("BATCH NO") );

        System.out.println("**************");

        // can you get me the infrmation of each student
        for ( Map <String,String> each : listOfStudents){
            System.out.println(each);
        }
        System.out.println("**************");

        //how can i get only the first names
        for ( Map <String,String> each : listOfStudents){
            System.out.println(each.get("FIRST_NAME"));
        }
        System.out.println("**************");

        // get me all the students whose batch numnber is more than one
        for ( Map <String,String> each : listOfStudents){
            if (Integer.parseInt(each.get("BATCH NO")) > 1){ // "2" --> 2
                System.out.println(each);
            }
        }
        System.out.println("**************");
        // get me the information of the last student

        for ( Map <String,String> each : listOfStudents){
            System.out.println(listOfStudents.get(listOfStudents.size() - 1));
        }

        //get me the last name of last student?
        System.out.println(listOfStudents.get(listOfStudents.size() - 1).get("LAST_NAME")); // Jerry
    }

    public static Map <String, String> makeMAp(String firstName, String lastName, String batchNo){
    Map <String, String> map = new HashMap<>();
        // I keep the key always with the same bc this one will not change
        map.put("FIRST_NAME", firstName);
        map.put("LAST_NAME", lastName);
        map.put("BATCH NO", batchNo);
        return map;
    }
}

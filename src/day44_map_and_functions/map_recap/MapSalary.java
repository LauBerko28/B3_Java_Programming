package day44_map_and_functions.map_recap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSalary {
    public static void main(String[] args) {

        Map <String, Double> map = new HashMap<>();
        // KEY= String VALUE= Double
        map.put("Jeyhun", 110_000.00);
        map.put("Gedi", 120_000.00);
        map.put("Elina", 105_000.00);
        map.put("OleksanderS", 130_000.00);
        map.put("OleksanderM", 100_000.00);
        map.put("Andrew", 125_000.00);
        map.put("Laura", 135_000.00);
        map.put("Ayaz", 140_000.00);

        //Find the person name and salary who is making the Highest salary and LOWEST salary
        // MAX SALARY:
        String nameForHighestSalary ="";
        double maxSalary = Double.MIN_VALUE; // here im just storing the MIN VALUE that Double can hold

        String nameForLowestSalary ="";
        double minSalary = Double.MAX_VALUE; // here im just storing the MAX VALUE that Double can hold

        for(String eachName : map.keySet()){

//            System.out.println("Each Name : " + eachName);
//            System.out.println("Each related salary: " + map.get(eachName)); // map.get(eachName) --> gets me the VALUE == > gets me the salary of each person
//            System.out.println();
            double salaryForEachName = map.get(eachName);
            if(salaryForEachName > maxSalary){
                maxSalary = salaryForEachName;
                nameForHighestSalary = eachName; // here im getting the name for the highest salary if the above condition is true
            }

            if (salaryForEachName < minSalary){
                minSalary = salaryForEachName;
                nameForLowestSalary = eachName;
            }
        }

        System.out.println("MAX SALARY: "+ nameForHighestSalary + " - $" + maxSalary); // MAX SALARY: Ayaz - $140000.0
        System.out.println("MIN SALARY: "+ nameForLowestSalary + " - $" + minSalary); // MIN SALARY: OleksanderM - $100000.0

        // SECOND WAY OF DOING IT
        for (Map.Entry<String,Double> eachPerson:map.entrySet()){

            if(eachPerson.getValue() > maxSalary){
                maxSalary = eachPerson.getValue();
                nameForHighestSalary = eachPerson.getKey();
            }
            if(eachPerson.getValue() < minSalary){
                minSalary = eachPerson.getValue();
                nameForHighestSalary = eachPerson.getKey();
            }
        }

        // Find from this data how many people make between 130k and 160k (both inclusive)

        int counter =0;

        for(Double eachSalary : map.values()){
            if(eachSalary >= 130000 && eachSalary <= 160000){
                counter++;
            }
        }
        System.out.println(counter + " number of people who make salary between 130k and 160k"); // 3 number of people who make salary between 130k and 160k

        System.out.println("**********");

        // find me the names (only) who makes less than 130k
        //String names="";
        List <String> allNames = new ArrayList<>();

        for (String eachName : map.keySet()){
            if (map.get(eachName) < 130_000){
                allNames.add(eachName);
            }
        }
        System.out.println(allNames); // [Gedi, OleksanderM, Andrew, Elina, Jeyhun]
        System.out.println(allNames.toString().replace("[","").replace("]","") + " make salary under 130k"); // Gedi, OleksanderM, Andrew, Elina, Jeyhun make salary under 130k

        System.out.println("**********");
        //Can you increase the salary for everyone by $10k in the data structure (map)

        System.out.println("Before Increase: " + map.values()); // Before Increase: [120000.0, 130000.0, 135000.0, 100000.0, 125000.0, 105000.0, 110000.0, 140000.0]
        for(String eachName : map.keySet()){
            map.put(eachName, map.get(eachName)+10_000.00); // remember everytime you have the same key as you cannot have duplicates it'll update the value instead, so here im updating it by 10k for every key  --> map.get(eachName) this will get me the value
        }
        System.out.println("After Increase: " + map.values());


    }



}

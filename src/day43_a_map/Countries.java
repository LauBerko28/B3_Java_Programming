package day43_a_map;

import java.util.*;

public class Countries {
    public static void main(String[] args) {

        //Map works with --> KEY : VALUE
        // KEY : VALUE (ENTRY) -> data has to be PRIMITIVE (Object Type)

        //KEY    , VALUE
        // String , ArrayList
        //String , "String, String, String" --> "String, String, String" is acting like one container "ArrayList"
        // I created a HashMap that has:
        //:         KEY of String type (countries)
        //          VALUE of ArrayList of String (cities)
        Map<String , ArrayList<String>> countries = new HashMap<>();

        // now how do i put information onto the map?
        countries.put("United States", new ArrayList<>(Arrays.asList("New York", "New Jersey", "Virginia", "Boston"))); // remember for arrayList the size is not fixed so all of them can be different
        countries.put("France", new ArrayList<>(Arrays.asList("Lyon", "Paris")));
        countries.put("Canada", new ArrayList<>(Arrays.asList("Toronto", "Vancouver","Ontario")));

        //how do i print?
        System.out.println(countries);
        // bc is hashMap no insertion order is kept
        // key          value                       key            value                                    key     value
        // {Canada=[Toronto, Vancouver, Ontario], United States=[New York, New Jersey, Virginia, Boston], France=[Lyon, Paris]}


        // print all the cities that have "i" in it

        for(String eachListOfCities : countries.keySet()){ // Hey give me all the keys for this map as a Set []
            // will get each of them one by one
            // i need to loop once again bc the outer loop will give me the
            System.out.println(countries.get(eachListOfCities));
            for (String eachCity : countries.get(eachListOfCities)){ // this will loop through the element of each ArrayList value
                if(eachCity.contains("i")){
                    System.out.println(eachCity);

            }

            }
        }


        System.out.println("************");
        for(ArrayList<String> eachList : countries.values()){
            System.out.println(eachList); // [Toronto, Vancouver, Ontario] [New York, New Jersey, Virginia, Boston] [Lyon, Paris]
            // now i need to loop through that arrayList to be able to get to each element
            for(String eachCity : eachList){
                if(eachCity.contains("i")){
                    System.out.println(eachCity); // Ontario Virginia Paris
                }
            }
        }

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*");
        //Lets ask a user which city they want to visit
        System.out.println("which city do you want to visit?");
        Scanner input = new Scanner(System.in);
        String userWishedCity = input.nextLine();

        // if the city is in our tour, we can say: "We have a flight on Sunday"; if not, raise an exception
        // first need to loop though all and see if its among the cities

        for (ArrayList <String> citytryList : countries.values()){

            //how can you improve your code?
            if (citytryList.contains(userWishedCity)){
                System.out.println("We have a flight on Sunday to " + userWishedCity);
            }


//            for (String eachCity : citytryList){
//                if(eachCity.equalsIgnoreCase(userWishedCity)){
//                    System.out.println("We have a flight on Sunday to " + userWishedCity);
//                    // every cycle if it doesnt match will print the else, that is why i use the break
//                    break;
//                }
//
//                }
            }
        }




    }



package day42_b_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {
        // first im going to create the object of this class
        // maps is an interface
        // HashMap can be a reference of itself and Map can also be it


        //map works with KEY and VALUE
        // here I have made the data structure of a map container, which will store the information of key and value. My key are Integer values and my value is String
        // key side cannot be duplicated, because when we use the .get method it does not work with duplicates, if there are
        Map <Integer, String> map = new HashMap<>();
        map.put(1,"one"); // same as .add
        map.put(3,"three");
        map.put(10,"ten");
        map.put(5,"five");
        System.out.println(map); // {1=one, 3=three, 5=five, 10=ten} --> INSERTION ORDER IN HashMap is Random

        //How do we read key value from map?
        // lets say I want to get the value assigned to number 3, so i use the method .get()
        System.out.println(map.get(10)); // the 10 is not the index is the KEY object --> ten
        String value = map.get(3); // this returns the value assigned to KEY (3) --> "three"
        System.out.println(value);

        //Q: how do I remove the KEY/VALUE
        map.remove(1);
        System.out.println(map); // {3=three, 5=five, 10=ten} --> remove (KEY); will remove the ENTRY (KEY+VALUE) which is associated with KEY(1) **NOT THE INDEX**

        // Q: How can I check if the specific KEY is in the map
        // A: using method .containsKey() and i can do it bc maps do not hold duplicates
        System.out.println(map.containsKey(1)); // false --> this value does not exist here any longer
        System.out.println(map.containsKey(3)); // true  --> this value exists in the map

        // Q: how can i check if the specific VALUE is in the Map
        // A: containsValue("Three")

        System.out.println(map.containsValue("five")); // --> true

        System.out.println(map.containsValue("10"));
       // System.out.println(map.containsValue(10)); --> since contains value (Object obj), sending 10 is fine but will return false
        map.put(null,null);
        System.out.println(map); // {null=null, 3=three, 5=five, 10=ten} --> no insertion order kept, and it accepts null values as keys

        ///HashMap can accept null as KEY and as VALUE

         map.put(5,"fivefive");
        System.out.println(map); // since map class does not allow duplicates, so if i try to add another KEY with the same element, it'll replace it {null=null, 3=three, 5=fivefive, 10=ten}

        map.put(null,"java");
        System.out.println(map);// {null=java, 3=three, 5=fivefive, 10=ten}

        map.put(null, "api");
        System.out.println(map); // {null=api, 3=three, 5=fivefive, 10=ten} --> value of null got updated
        map.put(3, "March");
        System.out.println(map); // {null=api, 3=March, 5=fivefive, 10=ten}
        map.put(7, "March");
        System.out.println(map); //{null=api, 3=March, 5=fivefive, 7=March, 10=ten} --> duplicate VALUES are ok, but duplicate KEYS are NOT OK


        //This is a nested map, but is not so common
        Map <Integer, Map<String,String>> map2 = new HashMap<>();

        // This is holding Map as a VALUE inside anther Map
        System.out.println();

        Map <String, Map<String, String>> infoPeopleAndCountry = new HashMap<>();

        Map <String, String> mapOne = new HashMap<>();
        mapOne.put("Tom", "Jerry");
        mapOne.put("Mickey", "Mouse");

        Map <String , String> mapTwo = new HashMap<>();
        mapTwo.put("Turkey", "Ankara");
        mapTwo.put("Azerbaijan", "Baku");

        infoPeopleAndCountry.put("people", mapOne);
        infoPeopleAndCountry.put("countries", mapTwo);
        System.out.println(infoPeopleAndCountry);
        // {countries={Azerbaijan=Baku, Turkey=Ankara}, people={Tom=Jerry, Mickey=Mouse}}
        // {KEY      ={VALUE                         }, KEY   = ( VALUE                 }}
        //infoPeopleAndCountry.put(3, map); //can NOT add it because it is <Integer, String>

        System.out.println(  infoPeopleAndCountry.get("countries")  );   // This will give me mapTwo --> {Azerbaijan=Baku, Turkey=Ankara}
        System.out.println(  infoPeopleAndCountry.get("countries").get("Turkey")  ); // here it'll go to the KEY countries, and will take the value of mapTwo, then it'll search with the key "Turkey" what its value is --> Ankara


    }


}

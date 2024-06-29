package day42_b_maps;

import com.sun.source.tree.Tree;

import java.util.*;

public class AllMapObjects {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>(); // HashMap is not ordered, null KEY is OK
        //        KEY     VALUE
        map1.put("feyruz","java");
        map1.put("nadir","selenium");
        map1.put("james","bond");
        map1.put("username","password");
        map1.put(null,"nothing");

        System.out.println(map1); // INSERTION order is not kept  {null=nothing, nadir=selenium, james=bond, feyruz=java, username=password}

        // now im creating the object of LinkedHashMaP
        Map<String, String> map2 = new LinkedHashMap<>(); // INSERTION order is kept **when I see the word Linked means that order is mantained  -- null KEY is ok
        //        KEY     VALUE
        map2.put("feyruz","java");
        map2.put("nadir","selenium");
        map2.put("james","bond");
        map2.put("username","password");
        map2.put(null,"nothing");
        map2.put("test",null);  // null VALUE is ok
        System.out.println(map2); // {feyruz=java, nadir=selenium, james=bond, username=password, null=nothing}

        Map<String, String> map3 = new TreeMap<>(); //TreeMap implements the sortedMap interface / it sorts the order
        // KEYs order is sorted (Ascending order) - null KEY is NOT OK
        //        KEY     VALUE
        map3.put("feyruz","java");
        map3.put("nadir","selenium");
        map3.put("james","bond");
        map3.put("username","password");
       // map3.put(null,"nothing"); --> NullPointerException = KEY is not OK
        map3.put("test",null);  // null VALUE is ok
        System.out.println(map3); // {feyruz=java, james=bond, nadir=selenium, test=null, username=password} --> alphabetic order is kept


        Map <String,String> map4 = new Hashtable<>(); // order is NOT kept, null KEY is not OK - null VALUE is NOT OK - It is THREAD-SAFE (SYNCHRONIZED)
        //        KEY     VALUE
        map4.put("feyruz","java");
        map4.put("nadir","selenium");
        map4.put("james","bond");
        map4.put("username","password");
        // map4.put(null,"nothing"); --> NullPointerException = KEY is not OK
        // map4.put("test",null);  --> NullPointerException = VALUE is not OK
        System.out.println(map4);





    }
}

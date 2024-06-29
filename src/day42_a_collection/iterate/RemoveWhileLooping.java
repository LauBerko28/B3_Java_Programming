package day42_a_collection.iterate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {
    public static void main(String[] args) {

        // creating an ArrayList of Integer type

        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(2,3,5,6,12,6,2,5,6,2,3,1,4,5));

//        // Traditional loop with removing, will cause an issue because indexes get shifted to left, so it'll skip some elements
        // THIS IS NOW A GOOD WAY OF DOING IT
//        for (int i = 0; i < list.size(); i++) { // im getting each element one by one
//
//            if (list.get(i) < 5){ // if the element is less than 5 then remove it
//                list.remove(i);
//            }
//           // list.get(i);
//           // System.out.println(i);
//
//        }
//        System.out.println(list);  // [3, 5, 6, 12, 6, 5, 6, 3, 4, 5]
//        // i = 0: 2, 3, 5, 6, 12, 6, 2, 5, 6, 2, 3, 1, 4, 5
//        // i = 1: 3, 5, 6, 12, 6, 5, 6, 3, 4, 5

        // ***************************************************************

        // With for each loop will get ConcurrentModificationException because we cannot change the size
//        for (Integer each : list){
//            if (each<5){
//                list.remove(each);
//            }
//        }
//        System.out.println(list); // ConcurrentModificationException
        // each = 2: 2, 3, 5, 6, 12, 6, 2, 5, 6, 2, 3, 1, 4, 5
//      // each = 3: 3, 5, 6, 12, 6, 5, 6, 3, 4, 5 ----- // ConcurrentModificationException

        //DOING IT THE RIGHT WAY

        System.out.println(list); // [2, 3, 5, 6, 12, 6, 2, 5, 6, 2, 3, 1, 4, 5]
        Iterator <Integer> iterator = list.iterator();
        // iterator has a .hasNext method
        while(iterator.hasNext()){ // checks if there is an element next to it. If yes it returns TRUE, if not it returns FALSE
            if (iterator.next()<5){ // move to the next element and return it, if this element is less than 5 then remove it // if my condition is true
                iterator.remove();
            }

        }
        System.out.println(list); // [5, 6, 12, 6, 5, 6, 5]




    }
}

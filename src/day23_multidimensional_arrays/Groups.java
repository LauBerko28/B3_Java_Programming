package day23_multidimensional_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        //  String [][] groups = new String[][]; if i do it like this it'll complain because i have to tell it how many single arrays it'll hold

        String [][] groups = new String[4][3]; // 2D will hold total 4 SINGLE dimensional array which will have 3 elements on each
        System.out.println(Arrays.deepToString(groups)); // this will give me [null, null, null, null] because there is no element inside the arrays

        String [][] groups2 = new String[4][]; // 2D will hold total 4 SINGLE dimensional array
        System.out.println(Arrays.deepToString(groups2));

        String [] groupTwo = {"Diliara", "Laura", "Alex"};
        groups[0] = groupTwo;
        System.out.println(Arrays.deepToString(groups));


        String [] groupThree = {"Alona", "Roma", "Kanan"};
        groups[2] = groupThree;
        System.out.println(Arrays.deepToString(groups));

        groups[3] = groupThree;
        System.out.println(Arrays.deepToString(groups));

        groups[1] = groups[0];
        System.out.println(Arrays.deepToString(groups));

        groups[3] = new String [] {"John", "Micky"};
        System.out.println(Arrays.deepToString(groups));

        System.out.println();
        //String [][] groups  = [[Diliara, Laura, Alex], [Diliara, Laura, Alex], [Alona, Roma, Kanan], [John, Micky]]

        for (String [] each : groups) { // this will loop through 2D array and get each SINGLE arrays
            //System.out.println(Arrays.toString(each));

            for (String eachName : each ) { // this will loop through each SINGLE array elements

                System.out.println(eachName);

            }
            System.out.println();
        }


    }
}

package day22_arrays;

import java.util.Arrays;

public class Equals {
    public static void main(String[] args) {
        int [] a = {1,2,3,4};
        int [] b = {1,2,3,4};
        int [] c = a; // here im only pointing at array a

        System.out.println(a==b); // DO MOT USE == TO COMPARE ARRAYS
                                  // This compares two different array objects thats why i need to use .equals
        System.out.println(Arrays.equals(a,b)); // true

        System.out.println(a==c); // DO NOT USE == TO COMPARE ARRAYS
        //                           in this case it returns TRUE because a and c are pointing at the same array object

        boolean result = Arrays.equals(b,c); // true ** i can assign it to a boolean because it always returns true or false
        System.out.println(result);

        int [] d = {4,3,2,1};
        System.out.println(Arrays.equals(a,d)); // false because even though the size is the same the order is different
        Arrays.sort(d); // 1 2 3 4
        System.out.println(Arrays.equals(a,d)); // true because is now sorted


    }

}

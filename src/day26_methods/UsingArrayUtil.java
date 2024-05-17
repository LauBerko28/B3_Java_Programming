package day26_methods;

import my_utilities.ArrayUtil;

public class UsingArrayUtil {
    public static void main(String[] args) {

        int [] a = {3,1,5,7,3,23};

        ArrayUtil.minNumInArray(a); // since it returns me a value I can print it directly or re-assign it to another value

        System.out.println(ArrayUtil.minNumInArray(a));

        System.out.println(ArrayUtil.maxNumInArray(a));

        ArrayUtil.contains(a,4); // returns me boolean true because the arr contains it
        ArrayUtil.contains(a,3); // returns falls because it doesnt contain the 3
    }
}

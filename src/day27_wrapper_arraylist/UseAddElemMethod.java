package day27_wrapper_arraylist;

import my_utilities.ArrayUtil;

import java.util.Arrays;

public class UseAddElemMethod {
    public static void main(String[] args) {

        int [] a = {1, 3, 4, 7, 8};
        int [] b = {23, 345, 2, 0};

       int [] arr = ArrayUtil.addElemInArray(a,b);
        System.out.println(Arrays.toString(arr));

        System.out.println(ArrayUtil.maxNumInArray(arr));
        System.out.println(ArrayUtil.minNumInArray(ArrayUtil.addElemInArray(a,b)));

    }
}

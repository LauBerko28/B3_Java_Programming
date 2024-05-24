package day25_methods;

import my_utilities.ArrayUtil;

public class ContainArray {
    public static void main(String[] args) {
        int [] nums = {234, 45, 23, 878, 345, 23, 1, 68};
        int num = 23;
        System.out.println(contains(nums,num));
        System.out.println(contains(nums,45));

        System.out.println(ArrayUtil.contains(nums,1));
    }

    public static boolean contains (int []arr ,  int num){

       // boolean result = false;
        for (  int eachNum : arr){
            if (eachNum == num){
                return true;
               // break;
            }
        }
        return false;
    }
}

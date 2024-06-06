package day34_b_encapsulation;

import my_utilities.StringUtil;

import java.util.Arrays;

public class Normal {
    public static void main(String[] args) {
        int [] a = {81, 23, 65, 33};
        Arrays.sort(a); // i called it by the class which means .sort is a static method
        // sort(a); --> cannot call it like this
        System.out.println(Arrays.toString(a));

        System.out.println(Math.PI);
        //System.out.println(PI); --> cannot call it by the methid

        StringUtil.reverse("java");
       // System.out.println(reverse("java"));
    }
}

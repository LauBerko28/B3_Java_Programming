package day15_string;
/*
    two Strings: hard code to have 3 characters each
    merge the Strings together

    ex:
        abc
        xyz

        output: axbycz
 */

public class MergeStrings {
    public static void main(String[] args) {

        String str1 = "abc";
        //             012 --> index
        String str2 = "xyz";
        //             012 --> index
        String merged = "";

        // merged = merged + str1.charAt(0) + str2.charAt(0);

            // shorthand operator allows me to add something to the result, that is why it prints axbycz
        merged += "" + str1.charAt(0) + str2.charAt(0) ; // merger = merged + "" + str1.charAt(0) + str2.charAt(0);
        merged += "" + str1.charAt(1) + str2.charAt(1);  // merger = merged + "" + str1.charAt(1) + str2.charAt(1);
        merged += "" + str1.charAt(2) + str2.charAt(2);  // merger = merged + "" + str1.charAt(2) + str2.charAt(2);
        System.out.println(merged);


        System.out.println("------------");
        String mergerNew = "";
        int i = 0;
        int j = 0;
        mergerNew += "" +  str1.charAt(i++) + str2.charAt(j++); // i = 1; j = 1;
        mergerNew += "" +  str1.charAt(i++) + str2.charAt(j++); // i = 2; j = 2;
        mergerNew += "" +  str1.charAt(i++) + str2.charAt(j++);
        mergerNew += "" +  str1.charAt(i) + str2.charAt(j);

        System.out.println(i); //
        System.out.println(j); //




    }
}

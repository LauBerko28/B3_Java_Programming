package day27_wrapper_arraylist;

public class ValueVsParse {
    public static void main(String[] args) {

        String s = "30";

        int num1 = Integer.parseInt(s); // converting String "30" into an int 30 [primitive]
        int num2 = Integer.valueOf(s); // converting String "30" into an Integer 30 [Wrapper Class / non-primitive / object type]

        int num3 = Integer.valueOf(s);
        /*
         Integer.valueOf(s); --> converts String "30" into Integer Object (Integer Wrapper Class Object)
         int num 3 = --> I am trying to store the value into a primitive variable

         primitive = object type [UNBOXING]

         */

        /*
        int a = 4;
        byte b = (byte)a; // Narrowing casting
        System.out.println(a);
        System.out.println(b);
        */



       Integer num4 =  Integer.parseInt(s);
       /*
        Integer.parseInt(s); --> converting String "30" into [PRIMITIVE DATATYPE] int in this case
        Integer num4  = --> here im trying to store the value into an Integer type (Wrapper class object)

        object type = primitive [AUTOBOXING]


        */




    }
}

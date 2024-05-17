package day26_methods;

public class TypePromotion {

    public static void main(String[] args) {

        use (5L);
        use(3); // its going to start searching for dataType int, if it doesnt find it, it'll go and search for the next dataType this is called a TypePromotion
        use (1.2f);
        use(3.5);
        use(3); // will print long
        use((double)3); // here im casting so when i print instead of going to long it'll now go to double 3.0


        byte b = 3;
        use(b);
        use((byte)4);



        // byte, short, int, long ----- float, double

    }

    public static void use (float f){
        System.out.println("calling float method");
    }

    public static void use (double d){
        System.out.println("calling double method");
    }

    public static void use (long l){
        System.out.println("calling long method");
    }


    public static void use (byte b){
        System.out.println("calling byte method");
    }
}

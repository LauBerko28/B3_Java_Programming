package day26_methods;

public class Picture {


    public static void draw (){
        System.out.println("Trying to draw"); // implementation is just a print statement
    }
//    public static String draw(String isThere ){
//        System.out.println("Trying to draw");
//        return "";
//    }

    public static void draw(String color){
        System.out.println("Trying to draw with " + color + " color");
    }

//
//    public static void draw(String col){
//        System.out.println("Trying to draw with " + color + " color");
//    }

    public static void draw(String color1, String color2){
        System.out.println("Trying to draw with " + color1 + " color and " + color2 + " color" );
    }


    public static String draw(String color1, String color2, String str){
        System.out.println("Trying to draw with " + color1 + " color and " + color2 + " color" );
        return "";
    }

    public static void draw(int num, String color){
        System.out.println("Trying to draw with " + num + " brush and " + color + " color" );
    }


    public static void draw(String color, int num){
        System.out.println("Trying to draw with " + num + color + " color" );
    }

    public static void draw(int num){
        System.out.println("Trying to draw with " + num + " brush" );
    }



    public static void draw(boolean is){
        System.out.println("Trying to draw with " + is + " brush" );
    }



    public static String draw(double is){
        System.out.println("Trying to draw with " + is + " brush" );
        return "";
    }

}

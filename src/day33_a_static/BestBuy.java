package day33_a_static;

public class BestBuy {



    //INSTANCE VARIABLE --> they belong to object
    String location;

    // this is a STATIC VARIABLE --> they belong to class
    // if something belongs belongs to the class means that everty object of this class they will share the same copy
     static String headquarters = "Richfield, 7601 Penn Ave S, United States" ;
    static int numOfComp = 100;  // --> think about this every store will have 100 computers

   // String specialDay = "Wednesday"; --> like this is an instance variable

    // if the specialDay will be the same for all locations then it makes sense to make it an static variable

    static String specialDay = "Wednesday";






    public BestBuy(String location){
        this.location = location;

    }

    // INSTANCE METHOD
    public void openStore(){
        System.out.println("opening the location in " + location);
    }


    //STATIC METHOD
    public static void reStrock (){
        System.out.println("Today is " + specialDay + ", special day and we are restocking");
        numOfComp = 200;
    }

}

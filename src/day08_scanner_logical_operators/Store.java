package day08_scanner_logical_operators;

public class Store {
    public static void main (String [] args){
        String store = "Target";
        int numOftv = 100;
        System.out.println("In the " + store + " store, there are " + numOftv + " TVs.");
        System.out.println("Someone came into the store and purchased 1 TV");
        //numOftv = numOftv -1;
        //numOftv--;
        //numOfTv -=1;
        //--numOftv;
        //System.out.println("Nox, in store we have " + --numOftv + " TVs");

        System.out.println("Nox, in store we have " + --numOftv + " TVs");

        System.out.println("Another person comes into store and puchases 1 TV");
        System.out.println("Nox, in store we have " + --numOftv + " TVs");

        System.out.println("Another person came in and put the TV into the shopping cart ");
        System.out.println("Now in the store we have " + numOftv-- + " TVs");


    }
}

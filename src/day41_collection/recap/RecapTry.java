package day41_collection.recap;

import java.util.ArrayList;

public class RecapTry {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("api");
        list.add("ci/cd");


        try {
            System.out.println(list.get(7)); // user will give me the index --> i know there is a possibility that the number the user provides is not within the range that is why i use the try-catch

            String s = null;  // if line 14 which is the first
            s.toLowerCase(); // kind of exception is nullpointer


        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());  // Index 4 out of bounds for length 3
            //e.printStackTrace();
            System.out.println("Index Out Of Bounds Exception");
        } catch (NullPointerException e){
            System.out.println("No object Found");
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(list); // [java, api, ci/cd]
        System.out.println("Done");

        try{
            Thread.sleep(2); // .sleep() has 2 exceptions at the runtime and at the compile. if i get a -2
        }catch (InterruptedException | IllegalArgumentException e ){ // InterruptedException --> will take care of the compile exception AND IllegalArgumentException --> will handle the runtime exception
            System.out.println("number is wrong ");
        } finally {
            System.out.println("this will always run");
        }

        System.out.println("FINAL");
    }
}

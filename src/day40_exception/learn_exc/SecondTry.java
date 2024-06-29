package day40_exception.learn_exc;

public class SecondTry {
    public static void main(String[] args) {


        try {  // there are 2 lines in this code that can give me an issue, thats why im sending them to the try catch - to handle it I'll need multiple catch
           // String s = null; // I can assign null to String because String is a class and its default value is null
            //System.out.println(s.length()); // NullPointerException --> RUNTIME EXCEPTION

            String s = "loop";
            System.out.println(s.length()); // 4 is the length so no issues

            int[] a = {1, 2, 3, 4, 5};
            //System.out.println(a[0]); // 1
            System.out.println(a[9]); // ArrayIndexOutOfBoundsException --> RUNTIME EXCEPTION

            // this will catch only from the first one- so if the first catch is true
        } catch (NullPointerException e) { // RUNTIME EXCEPTION
            System.out.println("Null pointer exception is caught");
        }  catch (ArrayIndexOutOfBoundsException e){ // RUNTIME EXCEPTION
            System.out.println("Array Index Out Of Bounds Exception is caught");
        }

        System.out.println("Done");
        }

}

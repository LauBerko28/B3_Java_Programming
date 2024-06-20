package day40_exception.learn_exc;

public class SecondTry2 {
    public static void main(String[] args) {

        try {
            // there are 2 lines in this code that can give me an issue, thats why im sending them to the try catch - to handle it I'll need multiple catch
            // String s = null; // I can assign null to String because String is a class and its default value is null
            //System.out.println(s.length()); // NullPointerException --> RUNTIME EXCEPTION

            String s = "loop";
            System.out.println(s.length()); // 4 is the length so no issues

            int[] a = {1, 2, 3, 4, 5};
            //System.out.println(a[0]); // 1
            System.out.println(a[9]); // ArrayIndexOutOfBoundsException --> RUNTIME EXCEPTION

            // here im trying to catch 2 runtime exceptions under one condiition
        } catch (RuntimeException e) { // RUNTIME EXCEPTION
            System.out.println("Either Null Pointer exception or Array Index Out of Bound Exception is caught");
        }

        System.out.println("Done");
    }

    }


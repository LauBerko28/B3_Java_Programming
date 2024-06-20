package day40_exception.catch_order;

public class TryWithInheritance {
    public static void main(String[] args) {

        try {
            int [] a = {1,2,3,4,5};
            System.out.println(a[9]);
        } catch (IndexOutOfBoundsException e) { // smaller class

        } catch (RuntimeException e) { // second smaller class

        } catch (Exception e) { // parent biggest class - I place it at last so all the other classes can have access to this one
            /**Parent exception class cannot be before child exception class
             * Because the parent Exception will catch whatever Child will catch as weel
             * So, Child Exception class will never be reached
             */

            /*
            All possible references of IndexOutOfBoundException class
                    ITSELF:
                   IndexOutOfBoundsException = new IndexOutOfBoundsException();

                    PARENT:
                    RuntimeException e = new IndexOutOfBoundsException();

                   GRAND PARENT:
                   Exception e = new IndexOutOfBoundsException();



             */

        }
    }
}

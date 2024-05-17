package day26_methods;

public class SumOfElements {
    public static void main(String[] args) {
        int [] arr = {1, 3, 4, 5, 7};
        System.out.println(sum(arr));

        // System.out.println(sum({1, 3, 4, 5, 7};)); --> i can not print an array like this
        System.out.println(new int[] {1, 2, 3, 5, 56});
        System.out.println(sum(1, 2, 3, 5, 56));

        sum("java", "loop", "api");

        System.out.println(contains(1, 2, 3, 5, 56));
        System.out.println( contains(20, 464, 3456, 456, 34, 345, 654, 34, 23, 3, 2, 23, 543)); // false because it doesnt contain 20
    }


    public static boolean contains (int num, int  ... arr){

        // boolean result = false;
        for (  int eachNum : arr){
            if (eachNum == num){
                return true;
                // break;
            }
        }
        return false;
    }


    // Create a method that accepts int array and sums up all the elements in the array and return that total
 /*
    public static int sum (int [] nums) {
        int sum = 0;
        for ( int eachNum :nums){
            sum += eachNum;
        }
        return sum;
    }
    */

    // here im doing it with var-args ...
    public static int sum (int ... nums) {
        int sum = 0;
        for ( int eachNum :nums){
            sum += eachNum;
        }
        return sum;
    }

    public static void sum (String ... word) {

        for ( String ea : word) {
            System.out.println(ea);
        }
    }






}

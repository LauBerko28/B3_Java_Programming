package day26_methods;

public class ArrayIndexOf {
    public static void main(String[] args) {


        int [] arr = {12, 3, 5, 73, 13, 2, 5};
        //             0

        System.out.println(indexOf(arr, 5)); // this will print the index of a number


        String [] arr2 = {"java", "selenium" , "api"};
    }

    // arrays dont have index of so im trying to create something that will work like indexOf
    public static int indexOf (int [] arr , int num) {

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i] == num ){
                return i; // with this one im looping to find a matching case
            }
        }

        return -1; // think about when you do an indexOf in String and there is not a matching case then java will return -1
    }

    public static int indexOf (String [] array, String word){

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(word)){
                return i;
            }
        }
        return -1;
        }
    }




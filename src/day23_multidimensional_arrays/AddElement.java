package day23_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("how many elements in your first array do you want to have: "); // will give me the amount of numbers they want
        int [] firstArray = new int [key.nextInt()]; // 3 and because im gonna asign to the index then i use a fori


        System.out.print("Enter your data/value one by one pressing enter ");
        for (int i = 0; i < firstArray.length; i++) {

            firstArray[i] = key.nextInt(); //

        }
        System.out.print("First Array: " + Arrays.toString(firstArray));

        System.out.print("How many more elements do you want to add to the first Array: ");
        // int numsToAdd = key.nextInt(); -- > if im not using this later on then i can do it directly on the below
        int [] secondArray = Arrays.copyOf(firstArray, firstArray.length + key.nextInt()); // created a second array by copying the first array and making it bigger than the original one
        // firstArray.length + key.nextInt() --> telling the code to add something else on top of what i had originally

        for (int i = firstArray.length; i < secondArray.length; i++) {// starting from the firstArray.length is basically starting from the end of the fisrt array and adding from then forwards;


        }


    }
}

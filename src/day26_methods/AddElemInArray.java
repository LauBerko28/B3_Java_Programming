package day26_methods;

// Create a method that accepts int [] and a number and returns an int [] with the added element in it.

import java.util.Arrays;

public class AddElemInArray {
    public static void main(String[] args) {

        int [] a = {1,2,3};

        // int [] b = null; // this means you have created only reference nothing in the memory

        int [] b = addElemInArray(a,5);
        System.out.println(Arrays.toString(b));

        Arrays.toString(addElemInArray(b,943));

        // original
        int [] mine = {22, 29};
       // Arrays.toString(arrLau())

    }

    public static int [] addElemInArray ( int [] origArr , int num ){

        int [] newArr = Arrays.copyOf(origArr, origArr.length+1);
        //  {1,2,3,_}
        newArr [newArr.length-1] = num;

        return null;
    }

    // This is doing the exactly same this=ng than above but using a fori loop
    public static int [] addElemInArr2 (int [] origArr, int elemToAdd){


        int [] newArr = new int[origArr.length+1];


        for (int i = 0; i < origArr.length; i++) {
            newArr[i] = origArr[i];
        }
        // {1, 2, 3,  _ }
        newArr[newArr.length - 1] = elemToAdd;

        return newArr;
    }

    public static int [] arrLau (int [] first , int [] lastNum){

        int [] newMine = new int[first.length];

        for (int i = 0; i < first.length; i++) {
             newMine [newMine.length-1] = first[first.length-1];
                     }
       // newMine[newMine.length-1]=lastNum;
        return newMine;
    }




}

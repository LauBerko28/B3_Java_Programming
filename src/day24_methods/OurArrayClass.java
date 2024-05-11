package day24_methods;
/*
all will accept array argument

    create a method that will print the first element
    create a method that will print the last element
    create a method that will print the element/s
        length matters -> if even there are two middle, for odd there is one middle
 */
public class OurArrayClass {
    public static void arrFirstElement (int [] arr) {
        System.out.println("First Element: " + arr[0]); // here im printing the first element of my array
    }

    public static void arrLastElement (int [] arr){
        System.out.println("Last Element: " + arr[arr.length-1]);
    }

    public static void arrMidElements (int [] arr){
        if (arr.length % 2 ==0){ // here im finding if the array size is even
            System.out.println("Middle first: " + arr[arr.length/2-1]);
            System.out.println("Middle second: " + arr[arr.length/2]);
        }else{
            System.out.println("middle: " + arr[arr.length/2]);
        }
    }

    public static void main(String[] args) {
        int [] numbers = {10,2,4,765,23,0,2344};
        int [] numbers2 = {1034,23452,234,331,2234,0,54};
        int [] numbers3 = new int [3]; // here im only saying hey i need an array size 3 but i have not yet given it any values so when i print it it gives me [0,0,0]
        int [] numbers4 = {1034,23452,234,331,2234,0,54}; // has 7 elements the middle one is 331 --> length/2 (7/2) ---> 3
        int [] numbers5 = {1034,23452,234,331,2234,0,54, 65}; //   has 8 elements middle 331,2234 --> length/2 (8/2) ---> 4


        arrFirstElement(numbers); // is expecting an array inside the ()
        arrLastElement(numbers);
        System.out.println();

        arrFirstElement(numbers2);
        arrLastElement(numbers2);
        System.out.println();

        arrFirstElement(numbers3);
        arrLastElement(numbers3);
        System.out.println();

        arrMidElements(numbers4);
        arrMidElements(numbers5);

    }
}

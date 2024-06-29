package day44_map_and_functions.functions;

public class UsingNumberInterface {
    public static void main(String[] args) {
        // ref of functionalInterface
        NumberInterface evenOrOdd = (number) -> { // if my functional interface only has 1 parenthesis I can have it without the ()
            if(number % 2 == 0){
                System.out.println(number +" is even");
            }else {
                System.out.println(number + " is odd");
            }
        }; // here im making the implementation
        // whatever i have in the parenthesis will match what is in the parentheshes of FunctionalInterface


        // here i'm ussing the reference evenOrodd to have the method
        evenOrOdd.apply(5);
        evenOrOdd.apply(10);
        evenOrOdd.apply(123);
        evenOrOdd.apply(456);

        System.out.println("*****************");
        // (n) -> : this is my lambda expression
        NumberInterface cube = (n) -> System.out.println(n * n * n); // 125 --> if only one use hen i dont need the {}
        // if your abstract method accepts one argument using() is optional
        // if your code has only 1 statement {} curly bracket is also optional
        // Like the sample above or we can do it like shown below
       // NumberInterface cube = (n) ->
       // { System.out.println(n * n * n)};

        cube.apply(5); // here im calling my cube implementation

        System.out.println("*****************");

        A a = new A();
        a.apply(4);
    }
}

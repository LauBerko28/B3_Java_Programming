package day35_inheritance.recap;

public class PizzaStore {
    public static void main(String[] args) {

        Pizza p1 = new Pizza("Hello", 6); // small, medium, large, xlarge
        // Pizza size: null, number of toppings: 6, the total price is $-1.0 --> because i dont have a valid size
        //p1.size = "Hello"; --> Since it is encapsulated, cannot reach it directly

        System.out.println(p1);

        Pizza p2 = new Pizza("medium", 6);
        System.out.println(p2); // Pizza size: medium, number of toppings: 6, the total price is $10.5
    }
}

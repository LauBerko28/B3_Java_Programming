package day34_b_encapsulation;

public class UseSquare {
    public static void main(String[] args) {

        //CREATING THE OBJECT OF SQUARE

        Square obj = new Square(-5);
        // obj.side = 5; --> since side variable is private, cannot access directly

        System.out.println(obj.getSide()); // 0 --> for the default value

        obj.setSide(11); // here im setting the side to 11
        System.out.println(obj.getSide());  // here i only want to see it
    }
}

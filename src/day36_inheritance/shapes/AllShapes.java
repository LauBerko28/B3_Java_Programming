package day36_inheritance.shapes;

public class AllShapes {

    public static void main(String[] args) {

        Circle obj1 = new Circle(4.5);
        System.out.println( obj1.area());
        System.out.println(obj1);
        /*
        Info about Circle
        Area: 63.61725123519331
        Perimeter: 28.274333882308138
        Radius: 4.5
         */

        System.out.println();

        Square obj2 = new Square(6);
        System.out.println(obj2.area());
        System.out.println(obj2);

        /*
        36.0
        Info about Square
        Area: 36.0
        Perimeter: 24.0
        Side: 6.0
         */
    }
}

package day36_inheritance.shapes;

public class Circle extends Shape {

    // this instance variable belongs only to Circle
    double radius;
    public Circle( double radius) {
        super("Circle"); // here i can hardcoded bc im always talking about circle
        this.radius = radius;

    }
    @Override
    public double area(){ // the structure is the same but implementation in the coe block is different
        return radius * radius * Math.PI; // 3.1416
    }

    @Override
    public double perimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Info about " + name + "\nArea: " + area() + "\nPerimeter: " + perimeter() + "\nRadius: " + radius;
    }
}

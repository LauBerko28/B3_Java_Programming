package day36_inheritance.shapes;

public class Square extends Shape {

    // this instance variable only belongs to square
    double side;
    public Square(double side) {
        super("Square");
        this.side = side;
    }
    @Override
    public double area(){ //the structure is the same but implementation in the coe block is different
        return side*side;
    }

    @Override
    public double perimeter(){
        return side * 4;
    }

    @Override
    public String toString() {
        return "Info about " + name + "\nArea: " + area() + "\nPerimeter: " + perimeter() + "\nSide: " + side;
    }




}


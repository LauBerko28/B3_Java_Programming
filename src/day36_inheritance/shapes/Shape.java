package day36_inheritance.shapes;

public class Shape {

    String name;

    public Shape(String name) {
    this.name = name;
    }

    // this is an area method -  general method
    public double area(){ // double radius is my local variable, is not coming from my child class
        return 0.0;
    }

    public double perimeter(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name= " + name;
    }
}

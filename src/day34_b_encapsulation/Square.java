package day34_b_encapsulation;
/*
    create a class called Square

    - data:
        side

*/
/*
    - constructor

        - create a constructor that creates a Square object with the side

            call setter here

    - encapsulate the Square class

        - setter condition: side must be a positive number otherwise it will not be assigned to the instance variable

*/
/*
    - other methods methods:

        - calculateArea()
            calculate and return the area of a Square

        - calculatePerimeter()
            calculate and return the perimeter of a Square

        - toString()
            print the side, area, and perimeter of the Square object

    Create a separate class to create and test the Square objects

 */
public class Square {

    //INSTANCE VARIABLES is private, i can give access with getters and setters
    private int side;

    // CREATE A CONSTRUCTOR
    // i use the parameter because when someone is going to create an object i want them to give me some information
    public Square(int side){
        setSide(side);
    }

    // has return type
    public int getSide(){
        return side;
    }

    // I can access the getters and setters on another class because they are public
    public void setSide(int side){
        if (side > 0){
            this.side = side;
        }
    }

    // im not passing anything because in this excersice i want to use my oprivate var
    public int calculateArea(){
        return side * side;
    }

    public int calculatePerimeter (){
        return side * 4; // side + side + side + side
    }

    public String toString (){
        String info = "Square info - Side: " + side + " | Area " + calculateArea() + " | Perimeter: " + calculatePerimeter();

        return  info;
    }

}

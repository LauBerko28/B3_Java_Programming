package day42_b_maps.classroom;
//class is a template that im building for an object
public class Student {

    String name;
    double age;
    int id;

    //creating a constructor to initialize the 3 instance variables
    public Student(String name, double age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString(){ // toString comes all the way from Object class, and it requires that it gets implemented
        return "Student Information:" + "\n\tName: " + name + "\n\tAge: " + age + "\n\tID: " + id;
    }



}

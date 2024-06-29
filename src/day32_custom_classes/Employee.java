package day32_custom_classes;

public class Employee {

    // this are instance variables that each object of Class Employee will have its own copy
    String name;
    int id;
    String jobTitle;
    double salary;

    //              local variables
    public Employee(String name, String jobTitle){
    this.name = name;
    this.jobTitle = jobTitle;

    }

    // second constructor -- this is an overloaded constructor method
    public Employee(String name, String jobTitle, int id, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;

    }

    // Instance method --> without STATIC keyword
    public void goingToMeeting (){
        System.out.println(name + " is going to a meeting");
    }


    @Override
    public String toString() {
        return name + " - " + jobTitle + " - " + id + " - $" + salary;
    }
}

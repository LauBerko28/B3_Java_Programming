package day32_custom_classes;

public class EmployeeV2 {
    // these are instance variables that each object of Class Employee will have its own copy
    String name;
    int id;
    String jobTitle;
    double salary;

    //              local variables
    public EmployeeV2(String name, String jobTitle){
        this.name = name;
        this.jobTitle = jobTitle;

    }

    // second constructor -- this is an overloaded constructor method
    public EmployeeV2(String name, String jobTitle, int id, double salary){

        // IMAGINE I DONT HAVE THE BELOW LINES
//        this.name = name;
//        this.jobTitle = jobTitle;

        // Hey instead of assigning them like above one by one, as i already have a constructor that does that, call that constructor to initialize that one
        this(name,jobTitle); 
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

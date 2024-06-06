package day34_c_inheritance.animal.person;

public class Student extends Person{

    boolean isHappy;

    // this is a child class, and the information i pass in here is the one unique to this class
    public void study(){
        System.out.println(name + "is studying ");
    }
}

// Student is-A Person
// Student is-A subclass / Child Class / Derived Class

package day34_c_inheritance.person;

public class Building {
    public static void main(String[] args) {

        Person p = new Person();
        p.name ="general name";
        p.age =0;
        p.talk();
        // p.study(); --> PARENT CLASS CANNOT REACH ANYTHING FROM CHILD
        // p.isHappy(); --> cannot have access becouse it belongs to the child not the parent


        Student s1 = new Student();
        s1.name ="Winnie"; // Child Class can access to Parent Class members
        s1.age = 18;    // Child Class can access to Parent Class members
        s1.talk();      // Child Class can access to its own members
        s1.study();     // Child Class can access to its own members
        s1.isHappy = true;


        OnlineStudent o1 = new OnlineStudent();
        o1.name = "Tom";
        o1.isHappy = true;
        o1.zoomLinkAddress = "httpps://....";
    }
}

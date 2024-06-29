package day30_b_custom_classes;

import java.util.ArrayList;
import java.util.Scanner;

public class AllPeople {
    public static void main(String[] args) {

        // there are not valid ways to reach instance variables
//        System.out.println(name);
//        System.out.println(age);
//        System.out.println(height);


        // sample of objects we have learned (right side), and they are coming from java.util or java.lang
        Scanner input = new Scanner(System.in);
        String str = new String ("hello");
        ArrayList <String> list = new ArrayList<>();



        // 1. first call the class then give it a name and then create the object
        Person person1 = new Person();
        //Object reference = actual object

        //built a different object from the same object type
        Person person2 = new Person();

        // 2. to access the instance variables i need to create an object and use the object reference with DOT operator EX: person1.
        System.out.println("Person 1 info");  // right now will print default values because is empty for now
        System.out.println(person1.name); // null
        System.out.println(person1.age);  // 0
        System.out.println(person1.height); // 0.0
        System.out.println(person1.isMarried); // false

        System.out.println("*************");

        System.out.println("Person 2 info"); // right now will print default values because is empty for now
        System.out.println(person2.name);  // null
        System.out.println(person2.age);   // 0
        System.out.println(person2.height); // 0.0
        System.out.println(person2.isMarried); // false

        System.out.println("*************");

        // 3. Now we can assign some values for each object
        person1.name = "Tom";
        person1.age = 40;
        person1.height = 5.7;
        person1.isMarried = true;

        System.out.println("*************");

        System.out.println("Person 1 info");
        System.out.println(person1.name); // Tom -- > printing instance variables
        System.out.println(person1.age);  // 40
        System.out.println(person1.height); // 5.7
        System.out.println(person1.isMarried); // true

        System.out.println("*************");

        System.out.println("Person 2 info"); // This one remains the same as every object has its own copy of instance variables
        System.out.println(person2.name);  // null
        System.out.println(person2.age);   // 0
        System.out.println(person2.height); // 0.0
        System.out.println(person2.isMarried); // false

        System.out.println("*************");

        // assingning values for person 3
        person2.name = "Mickey";
        person2.age = 35;
        person2.height = 6.2;
        person2.isMarried = false;

        System.out.println("Person 2 info");
        System.out.println(person2.name);  // Mickey
        System.out.println(person2.age);   // 35
        System.out.println(person2.height); // 6.2
        System.out.println(person2.isMarried); // false


    }
}

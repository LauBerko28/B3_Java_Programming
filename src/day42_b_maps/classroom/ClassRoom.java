package day42_b_maps.classroom;
/*
I want you to make a big data structor to hold the object of students
1 - Student
2- Student
3- Student
....
 */

import java.util.HashMap;
import java.util.Map;

public class ClassRoom {
    public static void main(String[] args) {

        // How can I make one container? -->  Map
        //  stud#   , dataType "class" this is what I want to store there
        Map<Integer,Student> map = new HashMap<>();

        // creating an object of Student class
        Student s1 = new Student("Tom",30,10);
        //      1: KEY s1: VALUE
        map.put(1,s1);  // here I stored my first sturent object to the map

        map.put(2, new Student("Jack", 27,7)); // here i used the object directly because Map also accepts Student
        map.put(3, new Student("Mickey", 20,8));
        map.put(4, new Student("Mouse", 18,5));
        System.out.println(map);

        /*
       { 1=Student Information:
	        Name: Tom
	        Age: 30.0
	        ID: 10,
	     2=Student Information:
	        Name: Jack
	        Age: 27.0
	        ID: 7,
	     3=Student Information:
	        Name: Mickey
	        Age: 20.0
	        ID: 8,
	     4=Student Information:
	        Name: Mouse
	        Age: 18.0
	        ID: 5}
         */

        System.out.println();
        //Q: Get me the student which is assigned to the KEY 3
        System.out.println(map.get(3));
        /*
        Student Information:
	        Name: Mickey
	        Age: 20.0
	        ID: 8
         */

        //Q: Get me the Student name which is assigned to the KEY 4
        System.out.println(map.get(4).name); // Mouse

        //Q: How can I get all the KEYS only
        //A: .keySet() --> Set does not allow DUPLICATES

        System.out.println(map.keySet()); // [1, 2, 3, 4]

        System.out.println();

        //Q: How can I get all the VALUES only?
        // A: .values();
        System.out.println(map.values());
        /*
        [Student Information:
	        Name: Tom
	        Age: 30.0
	        ID: 10,
	    Student Information:
	        Name: Jack
	        Age: 27.0
	        ID: 7,
	    Student Information:
	        Name: Mickey
	        Age: 20.0
	        ID: 8,
	    Student Information:
	        Name: Mouse
	        Age: 18.0
	        ID: 5]
         */


        // another way to loop and get each
        // keySet(for this exercise) will return me an Integer, that is why on the left side I can assign Integer
        for(Integer each : map.keySet()){
            System.out.println("Row number: " + each);
            System.out.println( map.get(each)); // map.get(each) --> will give me the value that is assigned to this
        }
        /*
        Row number: 1
            Student Information:
	            Name: Tom
	            Age: 30.0
	            ID: 10
        Row number: 2
            Student Information:
	            Name: Jack
	            Age: 27.0
	            ID: 7
        Row number: 3
            Student Information:
	            Name: Mickey
	            Age: 20.0
	            ID: 8
        Row number: 4
            Student Information:
	        Name: Mouse
	        Age: 18.0
	        ID: 5
         */

        // another way to loop through the values
        //map.values() will give me Students
        for(Student eachStudent : map.values()){
            System.out.println(eachStudent);

        }
        System.out.println("------------");

        // Q: get me the student only whose age is less than 25

        for(Student checkedAge : map.values()){
            if(checkedAge.age <25){
                System.out.println(checkedAge);
            }

        }
        /*
        Student Information:
	            Name: Mickey
	            Age: 20.0
	            ID: 8
        Student Information:
	            Name: Mouse
	            Age: 18.0
	            ID: 5
         */

        // ANOTHER WAY TO LOOP THROUGH USING THE .entrySet() method
        System.out.println("--------");
        for(Map.Entry<Integer,Student> each : map.entrySet()){ // hey from that map, how many entry (KEY and VALUE)
            System.out.println("Row: "+each.getKey());
            System.out.println("Value: "+each.getValue());

        }

        /*
        Row: 1
            Value: Student Information:
	        Name: Tom
	        Age: 30.0
	        ID: 10
        Row: 2
            Value: Student Information:
	        Name: Jack
	        Age: 27.0
	        ID: 7
        Row: 3
            Value: Student Information:
	        Name: Mickey
	        Age: 20.0
	        ID: 8
        Row: 4
            Value: Student Information:
	        Name: Mouse
	        Age: 18.0
	        ID: 5

         */
    }



}

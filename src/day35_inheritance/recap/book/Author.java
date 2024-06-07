package day35_inheritance.recap.book;

import my_utilities.StringUtil;

public class Author {
    // Here im encapsulating the instance variables for this class
  private String name;
   private int age;

    // CREATING A CONSTRUCTOR FOR THIS CUSTOM CLASS
    //Whenever someone creates an object of this class they'll need to provide these data
    public Author(String name, int age) {
        //this.name = name;
        setName(name); // this one will call the set method here
        //this.age = age;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    // "joJO moyes" --> Jojo Moyes -> ["joJo", "moyes"]
    public void setName(String name) { // will take thename from the Author given in the main method
        String result = "";
        for (String each : name.split(" ")) // if there is an space will look for it and create an array
        result += StringUtil.fixFormat(each); // on each cycle it'll look for each word and with the help of my created .fixFormat will convert the first letter to cappital and the rest lower case,

        // result = "Joje_Moyes_"
        this.name = result.trim(); //  i use the .trim method because i'll have an extra space at the end that i want to take care of
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age > 10) {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

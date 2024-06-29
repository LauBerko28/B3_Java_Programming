package day31_custom_classes;

public class Phone {
    String name;
    String brand;
    int memory;
    double version;

//    public Phone (String inputName){
//        name = inputName;
//    }

    public Phone (String name){
        this.name = name; // phone1.name = name; --> iPhone X
        // this. is saying that the instance variable is equals to name
    }

    public Phone (String name, String brand, int memory, double version){ // name = "Iphone X";
        this.name = name; // phone1.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;
    }

    public Phone (String name, String brand){ // name = "Iphone X";
        this.name = name; // phone1.name = name;
        this.brand = brand;
    }

    @Override
    public String toString() {  // when i print here i print the instance variable

        // the below is just showing that there are different ways to implement the toString method

        String str = name; // for the name im not assigning any conditions because i always want to assign it

        // the below im building a toString with some modifications

        // because my constructor methods have overload, i dont want them to print all the variables when their default values if the constructor does not inlcude this variable

        if (brand != null){ // if it is not default value (null) then take the value of the null and add it to this string
            str += " - " + brand;
        }

        if (memory != 0){
            str += " - " + memory;
        }

        if (version != 0.0){
            str += " - " + version;
        }


//        return "Phone{" +
//                "name='" + name + '\'' +
//                ", brand='" + brand + '\'' +
//                ", memory=" + memory +
//                ", version=" + version +
//                '}';

        return str;
    }


}

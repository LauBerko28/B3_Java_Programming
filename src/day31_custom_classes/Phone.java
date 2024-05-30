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
        return "Phone{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                ", version=" + version +
                '}';
    }


}

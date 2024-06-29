package day33_a_static;

public class Iphone {

    //INSTANCCE VARIABLE
    String model;
    double price;

    //STATIC VARIABLE --> will be the same always
    static String company = "Apple";
    static String os = "iOS"; // OS = OPERATING SYSTEM

    // CUSTOM CONSTRUCTOR
    public Iphone (String model, double price){
        this.model = model;
        this.price = price;
    }

    // STATIC BLOCK - Static initialization -- IT WILL RUN FIRST
    // will be run first because it belongs to the class AND every object will have the same object
    static {
        System.out.println("STATIC BLOCK RUN");
        company = "Apple";
        os = "iOS";

      //  model = "ip" --> static can only accept static
    }




    // INSTANCE METHOD toString
    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';

       // "Company" + company; INSTANCE can accept STATIC and INSTANCE
    }
}

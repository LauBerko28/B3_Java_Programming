package day31_custom_classes;

public class Marker {

    String type;
    String brand;
    String color;

    // Once we have custom constructot, there is no MORE default constructor
    public Marker (String inputType, String inputBrand, String inputColor){
        type = inputType;
        brand = inputBrand;
        color = inputColor;
    }

    @Override
    public String toString() {
        return "Marker:" +
                "\n\ttype: " + type +
                "\n\tbrand: " + brand +
                "\n\tcolor: " + color ;
    }
}

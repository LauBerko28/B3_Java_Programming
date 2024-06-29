package day31_custom_classes;

public class UseMarker {
    public static void main(String[] args) {

        Marker marker1 = new Marker("Dry color", "Sharpie", "Black");
        System.out.println(marker1);
        /*
             Marker:
	            type: Dry color
	            brand: Sharpie
	            color: Black
         */

        Marker marker2 = new Marker("Oil color", "Expo", "Red");
        System.out.println(marker2);
        /*
        Marker:
	        type: Oil color
	        brand: Expo
	        color: Red
         */

    }
}

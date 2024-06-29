package day33_b_encapsulation.traffic;

public class Road {
    public static void main(String[] args) {
//TrafficLight light = new TrafficLight();
        //light.color = "Red";
        //System.out.println(light.color);

        //light.color = "Purple";
        //System.out.println(light.color);



        TrafficLight light = new TrafficLight("Yellow");
        System.out.println(light.getColor());


        TrafficLight light2 = new TrafficLight("Green");
        System.out.println(light2.getColor());
        //light2.color = "Yellow";
        //light2.color = "Black";
        light2.setColor("RED");
        System.out.println(light2.getColor());
        light2.setColor("Black");
        System.out.println(light2.getColor()); // will return RED becasue is the last value i assigned to it
    }
}

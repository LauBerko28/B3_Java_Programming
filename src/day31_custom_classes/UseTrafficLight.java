package day31_custom_classes;

public class UseTrafficLight {
    public static void main(String[] args) {
//        TrafficLight obj1 = new TrafficLight();
//        obj1.color = "green";

        // here im creating an object in a different way, and inside the parenthesis im just assigning an initial value to it. to be able to create it this way, i need to create a constructor special method
        /*
         public TrafficLight (String startColor){
        color = startColor;}
         */

        // this constructor will help me initialize the value
        // constructor --> new TrafficLight("Yellow")
        // "Yellow" is the initial value for my
        TrafficLight obj1 = new TrafficLight("Yellow");
        System.out.println(obj1.color); // --> "Yellow"

        obj1.color = "Red"; // here i re-assigned the value to Red
        System.out.println(obj1.color); // --> "Red"

        TrafficLight obj2 = new TrafficLight("Green"); // Here i just created a new object from the
        System.out.println(obj2.color); // --> "Green"


    }
}

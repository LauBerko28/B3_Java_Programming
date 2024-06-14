package day38_a_abstraction_interface.interface_methods;

public class MacBookPro implements Mac {

    @Override
    public void turnOn(){
        System.out.println("Macbook Pro is turning on..... ");
    }

}

class Runner {
    public static void main(String[] args) {

        // // you can use child class name to reach static variables inherited from parent interface - still good
        // System.out.println(MacBookPro.NAME);
        // System.out.println(MacBookPro.OS);

        System.out.println(Mac.NAME); // Better to call with interface name
        System.out.println(Mac.OS);


        Mac.company(); // this one is static --> I can reach by the class/interface name
       // Mac.faceTime(); // default method needs to be called from object --> and I cannot create the object of Mac, so i cannot access this method

       //   Mac.turnOn() --> also not valid, since in Mac interface there is no implementation of turnOn() method, I cannot call it like this

        // creating an object of MacBook pro

        MacBookPro obj = new MacBookPro();
        obj.faceTime(); // method  .faceTime() works because im calling it by the object
        obj.turnOn();
        // obj.company(); --> static methods from INTERFACE, are not inherited, so they cannot be accessed from objects, only by interface can be accessed

    }
}

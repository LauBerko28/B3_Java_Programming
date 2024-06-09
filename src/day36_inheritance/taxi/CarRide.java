package day36_inheritance.taxi;

public class CarRide {
    public static void main(String[] args) {

        Lyft obj1 = new Lyft("Tom");
        System.out.println(obj1.calculateRate(10));


        LyftXL obj2 = new LyftXL("Micky");
        System.out.println(obj2.calculateRate(10));

    }
}

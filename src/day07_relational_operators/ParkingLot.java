package day07_relational_operators;

public class ParkingLot {
    public static void main(String[] args) {
        System.out.println();
        int cars =10;
        System.out.println("Parking lot");
        // 1 car drove in
        cars = cars + 1;
        //or
        cars++;
        //or
        ++cars;
        // or
        System.out.println("Parking lot" + ++cars); // I can add it directly on the sentence
        // or
        System.out.println("Parking lot" + cars);
    }
}

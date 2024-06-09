package day36_inheritance.final_example;

public class UsingFinalExample {
    public static void main(String[] args) {

        FinalExample obj = new FinalExample(4);
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(FinalExample.PLANET);
        System.out.println("After reassign");
        //obj.a = 99;  // Since we have made "a" final, we cannot change value of final variable
        //obj.b = 909; // Since we have made "b" final, we cannot change value of final variable
        // FinalExample.planet = "Mars"; // Since we have made "PLANET" final, we cannot change value of final variable
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(FinalExample.PLANET);
        System.out.println(obj.PLANET);
        //System.out.println(obj2.planet); // Here is not declared yet

        System.out.println("-----------");
        FinalExample obj2 = new FinalExample(6);
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(FinalExample.PLANET);
        System.out.println("After reassign");
        // obj2.a = 88; // Since we have made "a" final, we cannot change value of final variable
        // obj2.b = 808; // Since we have made "b" final, we cannot change value of final variable
        // FinalExample.planet = "Saturn"; // Since we have made "PLANET" final, we cannot change value of final variable
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(FinalExample.PLANET);
        System.out.println(obj.PLANET);
        System.out.println(obj2.PLANET);



    }

}

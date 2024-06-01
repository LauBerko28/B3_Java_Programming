package day33_a_static;

public class BestBuyStore {
    public static void main(String[] args) {

        //creating the object of bestBuy
        BestBuy store1 = new BestBuy("Fairfax, VA");
        //creating a second object
        BestBuy store2 = new BestBuy("Bergenfield, NJ");
        //creating a third object
        BestBuy store3 = new BestBuy("Boston, MA");

        // hey i want to get the headquarters
        //System.out.println((BestBuy.location)); -> not valid - for instance variables

        System.out.println(BestBuy.headquarters);
        System.out.println(store1.headquarters);
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);
        /*
        Richfield, 7601 Penn Ave S, United States
        Richfield, 7601 Penn Ave S, United States
        Richfield, 7601 Penn Ave S, United States
        Richfield, 7601 Penn Ave S, United States
         */

        System.out.println("********************");
        System.out.println("In static all objects share the same information");


        store1.headquarters = "Tysons, 123 Test st, va, united States ";
        // the value changes for all of them as the object --> all the objects are pointing at the same thing
        System.out.println(BestBuy.headquarters);
        System.out.println(store1.headquarters);
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);
        /*
        Tysons, 123 Test st, va, united States
        Tysons, 123 Test st, va, united States
        Tysons, 123 Test st, va, united States
        Tysons, 123 Test st, va, united States
         */


        System.out.println();
        System.out.println(store2.location);
        store3.headquarters = "Chantilly, 987 Check Dr, VA, United States"; // here im changing the headquartes and this happesn to all of them
        store3.location = "Manhattan,NY"; // this will only change for store 3 because this is for an instance variable
        System.out.println(store1.location); // Bergenfield, NJ
        System.out.println(store2.location); // Fairfax, VA
        System.out.println(store3.location); // Manhattan,NY

        System.out.println();
        System.out.println(store1.headquarters); // we can still call static by object reference, but it is not good practice
        System.out.println(store2.headquarters);
        System.out.println(store3.headquarters);
        System.out.println(BestBuy.headquarters); // Anything static should be called by class name

        /*
        Chantilly, 987 Check Dr, VA, United States
        Chantilly, 987 Check Dr, VA, United States
        Chantilly, 987 Check Dr, VA, United States
        Chantilly, 987 Check Dr, VA, United States
         */

        System.out.println("**********");
        store1.openStore();  // opening the location in Fairfax, VA
        store2.openStore();  // opening the location in Bergenfield, NJ
        store3.openStore();  // opening the location in Manhattan,NY


        System.out.println("**********");
        // i want to call the restock method because is static is a better poractice to call it by the class

        BestBuy.reStrock(); // Today is Wednesday, special day and we are restocking
        store1.reStrock(); // you can still call it by the obj reference but is not a good practice

        System.out.println(store1.numOfComp); // 200 --> because i have updated it
        System.out.println(store2.numOfComp);
        System.out.println(store3.numOfComp);

        // when you see that someone is calling it by the class name means that this is a static method


    }
}

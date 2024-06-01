package day33_a_static;

import day32_custom_classes.Offer; // it has to import it because is from a different package
import day32_custom_classes.OfferV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyOffers {
    public static void main(String[] args) {

        Offer first = new Offer("Google", "Texas", 125_000, true, 15);
        System.out.println(first);  // Google is located in Texas 125000.0


        ArrayList <Offer> offerList = new ArrayList<>(); // created an arrayList that will hold Offer objects
        offerList.add(first); // added the first object into ArrayList of offer

        offerList.add(new Offer("Amazon", "New York", 130_000, true , 15)); // added another object into arrayList of Offer directly

       //  offerList.get(1); --> here im just saying that the reference to get thie above ArrayList adfdition can be reached this way

        System.out.println("--------------------");
        System.out.println(offerList);
        /*
        [Google is located in Texas
         125000.0
         , Amazon is located in New York
        130000.0]
         */

        // if i want to store multiple things in my array

        System.out.println("--------------------");
        Offer [] moreOffers = {
                new Offer("Apple", "Chicago", 140_000, false,10),
                new Offer("Tesla", "Texas", 150_000, false,20),
                new Offer("Facebook", "Florida", 160_000, false,10)};

        System.out.println(Arrays.toString(moreOffers));
        /*
        [Apple is located in Chicago 140000.0,
        Tesla is located in Texas  150000.0
        Facebook is located in Florida, 160000.0]
         */


        System.out.println("--------------------");
        // to add all the elements i need to convert it to Collection type

        offerList.addAll(Arrays.asList(moreOffers));
        System.out.println(offerList);

        // Can you store offers which is equal or more than 130_000 into another ArrayList
        ArrayList<Offer> salaryMoreList =  new ArrayList<>(offerList); // i used offerList to have the data
        salaryMoreList.removeIf(eachOffer -> eachOffer.salary <=130000);
        System.out.println("--------------------");
        System.out.println("List of Offers with more salaries");
        System.out.println(salaryMoreList);

        // Can you find the full time offers
        ArrayList<Offer> fullTime = new ArrayList<>(offerList);
        fullTime.removeIf(each -> !each.isFullTime); // i can also do a loop and say each.get(0) == true then remove it
        System.out.println("--------------------");
        System.out.println("List of Offers with full time");
        System.out.println(fullTime);
        /*
        List of Offers with full time
            [] --> because all my offers are not with full time
         */


    }

}

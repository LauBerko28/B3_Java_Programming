package day06_a_arithmetic_operators;
/*
    Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?,
        is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode,
        is a park nearby, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
 */
public class House {
    public static void main (String [] args){

        // We can declare multiple variables on the same line if they have same datatype
        //String word1;
        //String word2;
        String word1, word2;

        // We can declare and assign values to multiple variables on the same line if they have same datatype
        String houseType = "Penthouse", fullAddress =  "12345 Test ST";

        int numOfBedroom = 4;
        int numOfBathroom = 2;
        int numOfKitchen = 2;
        int zipCode = 54321;

        boolean hasBasement = true;
        boolean hasAttic = false;
        boolean hasPool = true;
        boolean isOnSale = false;
        boolean hasPark = true;

        double schoolRating = 4.9;
        double costOfHouse = 999_999.99;

        String houseInfo = "The " + houseType + " on" + fullAddress + ", " + zipCode + " cost $" + costOfHouse + "\n\tThe "
+ houseType + "has an attic: " + hasAttic + ", \n\thas a pool: "+ hasPool + "is on sale: " + isOnSale + "\n\thas a park: " + hasPark + ". \n\tThe  schools in the area have a rating of " + schoolRating;


        System.out.println("houseInfo = " + houseInfo);


    }

}

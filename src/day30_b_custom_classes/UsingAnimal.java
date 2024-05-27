package day30_b_custom_classes;

public class UsingAnimal {
    public static void main(String[] args) {

        // created a new object
        Animal animal1 = new Animal();
        //reference = object
        // assigning values to my Instance Variables
        animal1.population = 10000000;
        animal1.species = "bird";

        System.out.println(animal1.population); //  10000000
        System.out.println(animal1.species); // bird

        System.out.println(new Animal().species); // OUTPUT: null as i am creating a new object but there is no yet any values assigned to it


        new Animal().population = 1000; // here i created a completely new object and it doesnt have a reference so if i go to print it, it'll give me 0 as i cannot directly print it

        System.out.println("-----------------------");
        System.out.println(animal1); // --> BEFORE I CREATE THE TOSTRING INSTANCE METHOD  here im printing my object directly and the outcome is a storage location --> day30_b_custom_classes.Animal@75bd9247

        // -->> AFTER THE STRING INSTANCE METHOD IS CREATED
        // Species bird
        // Population 10000000
        /*
        public String toString (){

        // here im just declaring a String variable and doing concatenation
        String print = "Species " + species + "\nPopulation " + population;

        return print;
    }
         */


        // to be able to print objects, I have to have  toString method declared in Class
        System.out.println(new Animal());
        /*
        as this is a completely brand-new object i will see
            Species null
            Population 0
         */

    }
}

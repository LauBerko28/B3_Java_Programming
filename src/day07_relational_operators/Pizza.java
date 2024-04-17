package day07_relational_operators;
/*
    create a class Pizza
    add a main method
    declare and assign these variables:

       type of pizza,  the number of slices,  the number of people eating

    calculate how many slices each person will get
    calculate how many slices are left over

    Sample print statement:

       We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
 */
public class Pizza {
    public static void main (String [] args){
        String typeOfPizza= "cheese";
        int numberofSlices= 8, numberOfpeople = 4;
        int slicesPerPerson = numberofSlices/ numberOfpeople; // 10/4 --> 2 --> gives output what is DIVISIBLE
        int slicesLeftOver = numberofSlices % numberOfpeople; // 10 - (numberOfPeople * slicesPerPerson) = 2 ------ 10%4 --> gives output what is NOT DIVISIBLE
        String result = "We ordered " + typeOfPizza + " pizza with " + numberofSlices + " slices. " + numberOfpeople + " people ate " + slicesPerPerson + " each and " + slicesLeftOver + " is left.";
        System.out.println(result);


    }
}

package day04_variables;
/*
class name Olympics

    create a variable for the year
    print the country and year for next couple events
    reassign year value each time. Country name is hard coded

    data:

        China 2022
        France 2024
        Italy 2026

    Look forward to the year $year for the Olympics to be in $location

 */
public class Olympics {
public static void main (String []args){
    int year;

    System.out.println("Olympics have been and will be hel in these countries ");


    year = 2022;
        System.out.println("\tlooking forward to the year " + year + " for the Olympics to be in China");

        year = 2024; // i have to REASIGN the value before the print statement as JAVA reads from top/bottom left to right
        System.out.println("\tlooking forward to the year " + year + " for the Olympics to be in France");

        year = 2026;
        System.out.println("\tlooking forward to the year " + year + " for the Olympics to be in Italy");




}

}

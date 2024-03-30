package day03_comments_escape_sequence;

public class TabAndNextLine {
// EXAMPLES OF TAB
    public static void  main(String [] args){
        System.out.println("This is a sentence");
        System.out.println(" This is a sentence");
        System.out.println("  This is a sentence");
        System.out.println("   This is a sentence");


        System.out.println("\tThis is a sentence");//1 tab is equal to 4 spaces - the shortcut will be \t

        // let's put 2 TABS

        System.out.println("\t\ttThis is a sentence");

        System.out.println();

// EXAMPLES OF NEW LINE
        System.out.println("1) Go to store");
        System.out.println("2) Grab a bread");
        System.out.println("3) Pay cashier");


        System.out.println("1) Go to store 2) Grab a bread 3) Pay cashier"); // looks like this because is
        // only 1 print statement


        System.out.println("1) Go to store \n2) Grab a bread \n3) Pay cashier"); // \n gives the direction
        // to print in one line

System.out.println("Days of the Week \n\tMonday \n\tTuesday \n\tWednesday \n\tThursday \n\tFriday");


    }
}

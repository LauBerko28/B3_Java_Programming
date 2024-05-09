package day22_arrays;

import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("How many friends do you want to save: ");
        //int friendsCount = key.nextInt(); // I ask how many friends for it to give me the array size

        String [] friendsList = new String[key.nextInt()]; // 5 --- > [null, null, null, null, null]
        // THIS IS GIVING ME THE AMOUNT OF SPACES NEEDED ON THE STRING BASED ON THE FRIENDS COUNT

        key.nextLine();
        for (int i = 0; i < friendsList.length; i++) {
            System.out.print("Enter your friend's name: ");
            String eachInfo = key.nextLine().toLowerCase(); // WILL HELP ME PRINT EVERYUTHING IN LOWER CASE
            friendsList[i] = eachInfo.substring(0,1).toUpperCase() + eachInfo.substring(1); // GOES THORUGH THE INDEX OF i AND ASSIGNS THE VALUE OF EACH USER ENTRY, THEN IT CONVERTS THE FIRST CHAR TO UPPER CASE

        }


        System.out.println();
        System.out.println("I have " + friendsList.length + " friends."); // THIS WILL TELL ME THE AMOUNT OF FRIENDS
        System.out.println("Their names are: ");
        for ( String each : friendsList) {
            System.out.println("\t"+each);
        }


        }





    }


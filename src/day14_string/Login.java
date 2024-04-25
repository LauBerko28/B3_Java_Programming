package day14_string;

import java.util.Locale;
import java.util.Scanner;

/*

    Ask the user to enter a username
    make sure the username is in lowercase

    Ask the user to enter a password
    check if the password is more than 8 characters long

    valid system password: "loopcamp"

    -> if the entered password matches the system password
        logged in

        otherwise print:

        invalid password

 */
public class Login {
    public static void main(String[] args) {

        String expectedPassword = "loopcamp!";
        String expectedUsername = "JAVA";

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your username: ");
        String usernameFromUser = key.next(); // JAVA
        //usernameFromUser = usernameFromUser.toUpperCase(); // java

        System.out.print("Please, enter you password: ");
        String passwordFromUser = key.next();


        /*

            check if the password is more than 8 characters long
            valid system password: "loopcamp"

            -> if the entered password matches the system password
                logged in

                otherwise print:

                invalid password

            check if the username is matching
         */



        if (passwordFromUser.length() > 8 // returns as an int, but the dataType is still String
                && expectedPassword.equals(passwordFromUser) // here I have to use .equals because the variable is still String
                && expectedUsername.equalsIgnoreCase(usernameFromUser) ){ // JAVA vs java
            System.out.println("LOGGED IN");
        }







    }
}
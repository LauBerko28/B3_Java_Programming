package day15_string;

import java.util.Scanner;

/*
    ask the user to enter a message
    clean the message for empty spaces in the beginning and end
    check the message for bad phrases:

        java is bad
        quit
        have fun
        crying

    if there is a bad phrase in the message print:

        message failed to send

    otherwise print:

    $message sent
 */
public class Filter {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a message: ");
         String message = input.nextLine().trim(); // WE HAVE THIS CONTAINER TO HOLD THE ORIGINAL MESSAGE AFTER TRIMMED. SO WE CAN SO IT IN THE PRINT STATEMENT
         message = message.toLowerCase();

         // way 2 of trimming: message = message.trim(); --> i have to re-assign

        System.out.println("You entered: " + message);

        boolean hasBadWords = message.contains("java is bad") || message.contains("quit") || message.contains("have fun") || message.contains("crying");

        if (hasBadWords){
            System.out.println("Message failed to send");
        }else{
            System.out.println("\"" +message + "\" was sent!");
        }




    }
}

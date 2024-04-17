package day08_scanner_logical_operators;
/*
    Task
        declare and assign
            is it the weekend
            are you a teacher
            are you a police officer
            are you a firefighter

         Do you get a discount?
            Must be a weekend, and you must be one of the given professions
 */
public class Discount {
    public static void main (String [] args){
        boolean isWeekend = true;
        boolean isTeacher = false;
        boolean isPoliceOfficer = true;
        boolean isFireFighter = false;

        boolean isEligibleForDiscount = isWeekend && (isTeacher || isFireFighter || isPoliceOfficer); // is in () because I need one of them to be TRUE for the outcome to be TRUE ~~ it continues to read the && because I have () and this will be the first operation that it does
        //                                              false   ||     true      ||    false
        //                                                     true               || false
        //                                                                  true
        //                              true   &&     true
        //                                    true

        System.out.println("It is eligible: " + isEligibleForDiscount);



    }
}

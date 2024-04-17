package day08_scanner_logical_operators;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
    create and assign these variables:

        name
        are they citizen
        do have criminal background
        age

        sample inputs:
            "James Bond"
            true
            false
            49

    determine if they are eligible to vote, they can only vote
    if they are a citizen,
    have no criminal background
    and are 18 or above age 18

    print : $name is eligible to vote: $boolean

 */
public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Tom Jerry";
        boolean isCitizen = true;
        boolean hasCriminal = false;
        int age = 49;

        // PERSON # 1
        boolean isEligible = age >= 18 && isCitizen && !hasCriminal;
        //                   true && true && true
        //                   true         && true
        //                          true

        System.out.println( name + " is eligible to vote:  " + isEligible);

        System.out.println("-------------------------------------");

        // PERSON # 2
        name = "Winnie Pooh";
        isCitizen = true;
        hasCriminal = true;
        age = 59;

        System.out.println( name + " is eligible to vote:  " + !isEligible);
        // boolean isEligible = age >= 18 && isCitizen && !hasCriminal;
        //                  true  && true  && !true
        //                      true && false
        //                          false






    }
}

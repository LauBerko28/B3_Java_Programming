package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your browser: ");
        String browserType = input.next();

        switch (browserType) { // execution goes from the first match and continues until the first break
            // if there is no break, execution will start from the default
            // the order does not afect the result, as long as i have the breaks
            case "Chrome": // browserType == Safari || browsertYPE == safari
            case "chrome": // as the input must MATCH EXACTLY the expected i have to provide this option so the user information will still read
                System.out.println("Opening Google in Chrome browser.");
                break; // added to stop the execution once is true
            case "FireFox":
                System.out.println("Opening Google in FireFox browser.");
                break;
            case "Safari":
                System.out.println("Opening Google in " + browserType + " browser.");
                break;
            default:
                System.out.println("We do not have " + browserType + " browser type or it is an invalid one.");

                // do not need to have a break at the end
        }
    }
}


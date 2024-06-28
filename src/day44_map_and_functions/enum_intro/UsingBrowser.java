package day44_map_and_functions.enum_intro;

public class UsingBrowser {

    public static void main(String[] args) {
        //how can i call my constansts from my class
        // FIRST. Make the reference side of my enum

        Browser browser = Browser.CHROME; // Opening chrome browser because .CHROME is the one im passing

        switch (browser){
            case EDGE:
            case CHROME:
                System.out.println("Opening chrome or edge browser");
                break;
            case SAFARI:
                System.out.println("Opening safari browser");
            case FIREFOX:
                System.out.println("Opening firefox browser");
            default:
                System.out.println("NOT VALID browser");

        }
    }
}

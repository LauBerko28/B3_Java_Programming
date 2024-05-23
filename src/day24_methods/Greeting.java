package day24_methods;

import java.util.Scanner;

public class Greeting {

    public static void hello (String name){ // to pass what the user gave me into the method i have to give it a parameter inside the parenthesis
        // Parameterized method - meaning this method accepts parameter in the parenthesis -- >  String name = "Tom";
        // String name = "Tom";
        System.out.println("Hello " + name + "!. how are you?");
        System.out.println(name.toUpperCase());
    }
    public static void main(String[] args) {
        hello("Tom"); // When I call hello(String str); method, I am passing "Tom" as argument
        hello("Jake");

        Scanner key = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name2 = key.nextLine();

        // System.out.println("Hello " + name + "!. how are you?"); --> made this as a method to do this automatically for me
        hello(name2); // when i call hello string method i am passing the user name input as an argument ()

    }
}

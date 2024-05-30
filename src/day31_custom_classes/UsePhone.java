package day31_custom_classes;

import javax.swing.*;

public class UsePhone {
    public static void main(String[] args) {


        Phone phone1 = new Phone("iPhone X"); // --> im passing this value into a constructor
        System.out.println(phone1); // Phone{name='iPhone X', brand='null', memory=0, version=0.0}
    /*
     public Phone (String name){}
     */

        //System.out.println(phone1.inputName);  // This is not VALID


        Phone phone2 = new Phone("IPhone 14 pro", "Apple", 512, 24.2);
        System.out.println(phone2); // Phone{name='IPhone 14 pro', brand='Apple', memory=512, version=24.2}


        Phone phone3 = new Phone("Iphone 14 Max", "Apple");
        System.out.println(phone3); // Phone{name='Iphone 14 Max', brand='Apple', memory=0, version=0.0}
    }
}

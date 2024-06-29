package day36_inheritance.app;

public class AppStore {

    public static void main(String[] args) {
        Instagram obj1 = new Instagram(4.5);
        System.out.println(obj1.name); // even though i didn't provide the name when i created the object, on the class Instaagram in my constructor method i hardcoded the name so it'll always print the same
        System.out.println(obj1.version);
        obj1.postPicture();
        obj1.download();

        Youtube obj2 = new Youtube(5);
        System.out.println(obj2.name);
        System.out.println(obj2.version);
        obj2.download();
        obj2.watchVideo();
       // obj2.postPicture(); --> this cannot be reached bc the method belongs to instagram which is a sibling class


    }
}

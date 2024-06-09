package day36_inheritance.app;
/*
Create a class Instagram


Instagram class inherits App class


create constructor to call parent constructor and set up variables (name and version)


create method:
      postPicture()
          Example output: prints Posting picture to Instagram*/
public class Instagram extends App{

    public Instagram(double version){
    super("Instagram", version);
    // im hardcoding the app name because i know it'll always be the same (Instagram)
    }

    public void postPicture(){
        System.out.println("posting a picture to " + name);
    }
}

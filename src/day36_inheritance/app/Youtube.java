package day36_inheritance.app;

public class Youtube extends App{

    public Youtube(double version){
         super("Youtube", version); // im hardcoding the app name because i know it'll always be the same (Youtube)

    }

    public void watchVideo(){
        System.out.println("Watching java tutorial on " + name);
    }

}

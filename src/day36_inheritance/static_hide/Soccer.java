package day36_inheritance.static_hide;

public class Soccer extends Sports {

    //@Override - static methods do NOT get Overridden
    public static void cheer(){
        System.out.println("Cheering from the Child Class");
    }

    /*
        Note:
            It looks like we are overriding
            But we are NOT, because the method is - static

            We are hiding the cheer() method from parent class
     */
}

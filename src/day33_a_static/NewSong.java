package day33_a_static;

public class NewSong {
    public static void main(String[] args) {

        // up to this point i have only one way of creating the object (with constructor by default; --> Song s1 = new Song();

        Song s1 = new Song("Waka Waka");
        System.out.println(s1.name); // Waka Waka
        System.out.println(s1); // if i dont have the toString method this will print the memory location
        // if i dont have any other values assigned to the other local variables, i'll get their default variables

        // --> Song{name='Waka Waka', length=0.0, singer='null', genre='null'}

        Song s2 = new Song("Shape of heart", 3.0);
        System.out.println(s2); // -->Song{name='Shape of heart', length=3.0, singer='null', genre='null'}

        Song s3 = new Song("Rich Girl", 3.5, "Gwen Stefani", "Pop");
        System.out.println(s3); // Song{name='Rich Girl', length=3.5, singer='Gwen Stefani', genre='Pop'}

    }
}

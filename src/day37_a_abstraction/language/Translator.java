package day37_a_abstraction.language;

public class Translator {
    public static void main(String[] args) {
        // Language obj = new Language() --> cannot create the object of interface


        Spanish s = new Spanish();
        s.hi();
        s.bye();
        System.out.println(s.PLANET);

        System.out.println("-+-----------");

        Turkish t = new Turkish(); // below im reaching by the object
        t.hi();
        t.bye();
        System.out.println(t.PLANET);


        System.out.println("-------------"); // since they are static i can reach them by the class name as well
        System.out.println(Language.PLANET);
        System.out.println(Turkish.PLANET);
        System.out.println(Spanish.PLANET);

    }


}

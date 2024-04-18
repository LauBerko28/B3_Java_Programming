package day13_string;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Mickey";
        String name2 = "Mickey";
        String name3 = new String ("Mickey");

        // == ---> this operator compared the memory location.
        System.out.println(name == name2); // this will give me a true result.
        System.out.println(name == name3); // false
        System.out.println(name2 == name3); // false


        // How about if I want to compare the values of String
        // 1 - .eguals(""); returns boolean
        System.out.println(name.equals(name2)); // true
        System.out.println(name.equals(name3)); // true
        System.out.println(name2.equals(name3)); // true

        System.out.println(name.equals("Mickey")); //
        System.out.println(name.equals(new String("Mickey")));
        System.out.println("Mickey".equals(name2));
        // System.out.println("Mickey".nextInt)); --> does not work because String can only be compared against itself
        System.out.println(new String("Mickey").equals(name3));


        String str1 = new String ("Mickey");
        String str2 = new String ("Mickey");
        System.out.println(str1.equals(str2));

        System.out.println(new String ("Mickey Mouse").equals(new String("Mickey Mouse")));
        System.out.println();

        System.out.println("today".equals("TODAY")); // FALSE BECAUSE IS NOT THE SAME VALUE
        boolean compareNames = name.equals(name2);
        System.out.println("compareNames = " + compareNames);

        System.out.println("****************");


        //2 - .equalsIgnoreCase()
        String word1 = "Monday";
        String word2 = "MONDAY";
        System.out.println("Ignore Case and Compare: " + word1.equalsIgnoreCase(word2));
        String word3 = " MONDAY";
        System.out.println(word1.equalsIgnoreCase(word3));


        System.out.println("-------");

        // .lenght() --> count the number of characters and gives me a number of character

        String last = "Loopcamp";
        int countLetters = last.length();
        System.out.println(last.length());
        System.out.println("countLetters: " + countLetters);











    }
}

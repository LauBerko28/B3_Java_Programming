package day20_nested_loops;
/*
    Given two Strings determine if they are anagram or not.
    Strings are anagram if they are built up of the same characters
     Ex:
        listen vs silent  -->
        funeral vs  real fun
        a gentleman vs elegant man

     -> anagram
     Hint: look up and use replaceFirst() method
 */
public class Anagram {
    public static void main(String[] args) {

        String str1 = "a Gentleman"; //aaeeglmnnt_
        String str2 = "elegaNt may"; //aaeeglmnnt_


        str1 = str1.toLowerCase().replaceAll(" ", "");
        str2 = str2.toLowerCase().replaceAll(" ", "");

        System.out.println(str1);
        System.out.println(str2);


        if (str1.length() == str2.length()) {

            for (int i = 0; i < str1.length(); i++) {

                char each = str1.charAt(i);     //str1 = agentleman -- > a          > g          > e         > n         > t       > l     > e    > m    > a    > n
                //str2 = elegantman    > elegntman  > elentman   > lentman   > letman    > leman   > eman  > man  > an   > n    > ""

                str2 = str2.replaceFirst(each + "", "");


            }

            if (str2.isEmpty()) {
                System.out.println("Anagram");
            } else {
                System.out.println("NOT Anagram");
            }


        } else {
            System.out.println("Not Anagram");
        }
    }}



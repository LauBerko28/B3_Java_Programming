package day13_string;

public class StringImmutable {
    public static void main(String[] args) {

        String str1 = "loop"; // once i add the camp on the line below this line gets inactive and disapears because is immutable
        str1 = str1 + "camp"; // will print loopcamp, but this is a new space in the Stringpool memory

        System.out.println(str1);

        String str2 ="loop"; // it creates a new space on the Stringpool - does not use the same space as line 6, as this one already disapeared


    }
}

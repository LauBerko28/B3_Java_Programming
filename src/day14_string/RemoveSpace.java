package day14_string;

public class RemoveSpace {
    public static void main(String[] args) {

        String str = "    Thursday    ";
        System.out.println(str);
        System.out.println(str.length()); // 16

        str = str.trim(); // "____Thursday____" --> "Thursday'
        System.out.println(str.length());

        String str2 = "     java is fun     "; // 21
        System.out.println(str2.length());
        str2 = str2.trim(); // only removes from beginning and end, not the inbetweens
        System.out.println(str2.length()); // 11

        String str3 = "    loopcamp has SDET program    ";
        System.out.println(str3.length()); // 33
        System.out.println(str3.startsWith("   loopcamp"));

        System.out.println(str3.trim());
        System.out.println(str3.length());

        str3 = str3.trim();
        System.out.println(str3.length());
    }
}

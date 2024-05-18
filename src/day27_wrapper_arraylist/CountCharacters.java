package day27_wrapper_arraylist;
/*
given a String, count the number of uppercase, lowercase,numbers and other characters
aP3d572&*jd@jdJU
 */
public class CountCharacters {
    public static void main(String[] args) {

        String str = "aP3d572&*jd@jdJU";

        int upper = 0;
        int lower = 0;
        int digits = 0;
        int others = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i); // this will give me each character

            // LAU CHECK CLASS COUNTCHAR FROM LOOPS SO YOU UNDERSTAND THE OTHER WAY OF DOING IT

            if (Character.isUpperCase(each)){ // Character class is another method class
                upper++;
            } else if (Character.isLowerCase(each)) {
                lower++;
            } else if (Character.isDigit(each)){
                digits++;
            } else {
                others++;
            }

        }

        System.out.println("upper = " + upper);
        System.out.println("lower = " + lower);
        System.out.println("digits = " + digits);
        System.out.println("others = " + others);

        System.out.println(Integer.MAX_VALUE); // THESE ARE NOT METHODS. THERE ARE CONSTANTS WHICH WE WILL LEARN LATER
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
    }

}

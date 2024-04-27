package day18_loops;

public class Syllabels {
    public static void main(String[] args) {
        String str = "ja-va";
        int countDash = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)== ' '){
                countDash++;
            }
        }
        System.out.println("Number of Syllables: " + countDash+1); // because im starting from 0 i need to add the +1 if i were to start from 1 on the int then i dont need to add the +1 --> it does the same
    }

}

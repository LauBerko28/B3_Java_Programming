package day18_loops;

public class CountHi {
    public static void main(String[] args) {
        String str = "aaahiahhihibbcch"; // hi
        //            0123456
        int count = 0;

        //boundries testing because we are checking the edge/end
        for (int i = 0; i < str.length()-1; i++) {

            if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){ // do i+1 because im trying to check the char right next to it
                count++;
            }

        }
        System.out.println(count);

    }
}

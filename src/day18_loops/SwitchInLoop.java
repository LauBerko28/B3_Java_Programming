package day18_loops;

import org.w3c.dom.ls.LSOutput;

public class SwitchInLoop {
    public static void main(String[] args) {
        // switch: String, char, byte, short, int

        for (int i = 0; i <= 5 ; i++){
            //if number is 0 print zero, and so on.
            if (i == 0){
                System.out.println("zero");
            } else if (i == 1) {
                System.out.println("one");
            } else if (i == 2){
                System.out.println("two");
            }

            System.out.println("------");
            // this is with switch
            switch (i){
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
            }
        }
    }
}

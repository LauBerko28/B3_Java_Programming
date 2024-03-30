package day05_variables;

public class CharExamples {
    public static void main (String [] args){

                // declare and assign value to char datatype variable
                char letterOne = 'a';
                char letterTwo = 'Z';
                char letterThree = '9';
                char letterFour = '%';

                System.out.println(letterOne);  // a
                System.out.println(letterTwo);
                System.out.println(letterThree);
                System.out.println(letterFour);

                System.out.println(letterOne + letterTwo);  //aZ -- > 97 + 90 = 187

                char letter = 74; // J
                System.out.println(letter);

                // char letter2 = '75';  // This is invalid because single quote can only hold a single character


                System.out.println( letterOne + letterTwo + letterThree + letterFour);  // 97 + 90 + 57 + 37
                System.out.println( letterOne + " " + letterTwo + " " + letterThree + " " + letterFour); //
                System.out.println("chars: " + letterOne + letterTwo + letterThree + letterFour);


            }


    }


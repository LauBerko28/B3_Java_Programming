package day18_loops;
/*
java is java
01234567891011

length is 4 --java
              0123
 */
public class CountJava {
    public static void main(String[] args) {
        
        String str = "java is a java language java";
        int countJava = 0;

        for (int i = 0; i < str.length()-3 ; i++) { // i do lenght()-3 because im checking for a whole word in this case java

            String everyFour = str.substring(i, i+4);

            if (everyFour.equals("java")){
                countJava++;
            }

        }

        System.out.println(countJava);

            
        }
        
    }



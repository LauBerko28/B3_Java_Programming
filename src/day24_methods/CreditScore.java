package day24_methods;

public class CreditScore {
    public static void main(String[] args) {
        getCreditScore();
        System.out.println(getCreditScore());
        int score = getCreditScore();
        System.out.println(score);

        System.out.println(getCreditScore() + 50);

        boolean result = isGoodCreditScore(800);
        System.out.println(result);
        System.out.println(isGoodCreditScore(820));
        System.out.println(isGoodCreditScore(720));

        System.out.println(getCreditScore("Jerry"));


        System.out.println( isGoodCreditScore(  getCreditScore()  ));
    }

    /*
        Tom -- > 800
        Jerry -- > 820
     */
    public static int getCreditScore (String name) {

        int result = 0;
        if (name.equals("Tom")){
            result = 800;
        } else if (name.equals("Jerry")) {
            result = 820;
        } else {
            result = -1;
        }
        return result;
    }

    public static int getCreditScore () {
        return 800;
    }

    // Create a method that accept Credit Score
    // and return true if it is higher than or equal 800
    // otherwise return false
    public static boolean isGoodCreditScore(int score){
        boolean result;

        if (score >= 800) {
            result =  true;
        } else {
            result = false;
        }

        return result;

        // return score >= 800 ? true : false;
}}

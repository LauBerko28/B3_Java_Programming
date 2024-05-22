package day27_wrapper_arraylist;

public class YahooSearch {
    public static void main(String[] args) {

        //About 7,080,000 search results

        String result = "About 7,080,000 search results";
        String [] arr = result.split(" "); // ["About" "7,080,000" "search"  "results"]

        String resultStr = arr[1].replaceAll(",",""); //  7,080,000 --> 7080000
       // resultStr = resultStr.replaceAll(",","");

       long resultNum = Long.parseLong(resultStr);

       //Your task: After searching make sure the number is bigger than or equal 0;

        if(resultNum >= 0){
            System.out.println("TEST CASE PASSED - POSITIVE TESTING");
        }else {
            System.out.println("TEST CASED FAILED");
        }


        // System.out.println("After searching for \"Apartments\" " + "I see $numResult"); --> this is what i wanted to obtain so i code it as shown below
        System.out.println("After searching for \"Apartments\" " + "I see" + resultNum + " results");
        //System.out.println("Next year, after searching for \"Apartments\" " + "I see $numResult  + 1_000_000");--> this is what i wanted to obtain so i code it as shown below
        System.out.println("Next year, after searching for \"Apartments\" " + "I see" + resultNum  + 1_000_000);

        // TODO: Make sure the time is between 1 and 2 seconds
        // About 58,700,000 results (0.28 seconds)
        // take the inpout convert it to arr by split, then conver to int the seconds if it is between 1 and 2 seconds then is ok - possitive testing
    }
}

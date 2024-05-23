package day28_arrayList;
/*
    HTML Generator

    Given a String in the following format take the number part of the generator the html tags.
    Tags are surrounded with diamond brackets. The number of times to repeat with be given as the number after the ^

    Ex:
        Input:
            div^2
        Output:
            <div></div> <div></div>

    Ex:
        Input:
            li^3
        Output:
            <li></li><li></li><li></li>
 */
public class HtmlGenerator {
    public static void main(String[] args) {

        String str = "div^2";
        htmlGenerator(str); // here im calling return""; which is an empty String
        System.out.println(htmlGenerator("li^3"));
        System.out.println( htmlGenerator("span^5"));
    }

    public static String htmlGenerator (String str){
        String [] arr = str.replace("^", " ").split(" ");
        //                  div^2 --> div 2 --> ["div","2]

        int num = Integer.parseInt(arr[arr.length-1]); // i need the action to be repeated based on the last part of the String [], and because this is a String i have to use the number i have to convert it with parse to an Integer
        String html = "";

        for (int i = 0; i < num ; i++) { // i want to use a fori loop because
            //  <div></div> <div></div>
            html += "<" + arr[0] + "></" + arr[0] + ">";

        }


        return html;
    }

        }






package day25_methods;

import my_utilities.StringUtil;

public class MethodWithOthers {
    // This method return the variable after Switch statement assigned value to it.
//    public static String dayInWords (int dayNum) {
//
//        String dayWord = "";
//
//
//        switch (dayNum) {
//            case 1:
//                dayWord = "One";
//                break;
//            case 2:
//                dayWord = "Two";
//                break;
//            case 3:
//                dayWord = "Three";
//                break;
//            case 4:
//                dayWord = "Four";
//                break;
//            case 5:
//                dayWord = "Five";
//                break;
//            default:
//                dayWord = "Invalid";
//
//        }
//
//
//        return dayWord;
//    }


    // In this method we return directly in Switch statement
    public static String dayInWords (int dayNum) {

        String dayWord = "";


        switch (dayNum) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            default:
                return"Invalid";

        }

    }

    public static void main(String[] args) {

        System.out.println(dayInWords(5));

        String str = StringUtil.reverse("laura");
        System.out.println(str);


    }
}

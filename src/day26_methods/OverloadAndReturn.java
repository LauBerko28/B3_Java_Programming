package day26_methods;

public class OverloadAndReturn {

    public static void method (){
        System.out.println("empty method");
    }

// I tried to overload the method called "method" by changing ONLY return type
// THIS IS NOT ACCEPTABLE - Return type has no effect on METHOD OVERLOADING
//    public static int method (){
//        System.out.println("empty method");
//        return 0;
//    }


    public static int method (int a){
        System.out.println("return empty");
        return 0;
    }
    /*
    METHOD OVERLOADING
        1. Method name has to be same
        2. Parameters
            a. has to be different number of parameters if all the parameters data types are the same
                    method (String str);
                    method (String str, String str2)
            b. has to be different data types if the number of parameters are the same
                    method (String str);
                    method (int num);
            c. has to be different order if the number of parameters are the same
                    method (String str, int num);
                    method (int num, String str);
     */


}

package day31_custom_classes;

public class ThisKeyword {

    // instance variable
    int a;
    //                local variable
    public ThisKeyword(int a){
        a = a;

        // JAVA prioritizes local variables over instance variables

        // if i have the same name on instance and local variable how can i differentiate them?
        System.out.println(a); // --> it took the int a
        /*
        ic class UseThisKeyword {
    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(300);

        System.out.println(obj.a);// here im printing the object instance variable
    }in
         */
        System.out.println(this.a); // this. refers  to the INSTANCE variable

    }
}

package day36_inheritance.access.a;
// Same package - same class
// obj is in the same class with all the variables with different access modifiers
// Since it is in the same class, obj can have access to all
public class Fitst {

    // below i have 4 instance variables with the 4 different access modifiers
    public int one = 1;
    protected int two = 2;
    int three = 3;
    private  int four = 4;


    public static void main(String[] args) {

        Fitst obj = new Fitst();
        // i can access all of the variables because im in the same class and same package
        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
        System.out.println(obj.four);
    }
}

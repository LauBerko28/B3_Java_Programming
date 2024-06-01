package day33_b_encapsulation.access_modifiers;

public class AccessModifiers {

    public int a;  //INSTANCE VARIABLE - public access modifier
    int b;          // INSTANCE VARIABLE - default access modifier
    private int c;  // INSTANCE VARIABLE  - private access modifier


    public static int x;  //STATIC VARIABLE - public access modifier
    static int y;         // STATIC VARIABLE - default access modifier --> when they dont have anythign at the beginning they are default
    private static int z; // STATIC VARIABLE  - private access

    //In the SAME CLASS - SAME PACKAGE
    public static void main(String[] args) {

        // here i created an object of Access mod
        AccessModifiers obj = new AccessModifiers();
        // i can access the below because they are on the same class and package , we can access public, default and private
        System.out.println(obj.a); // with the object im trying to reach the
        System.out.println(obj.b);
        System.out.println(obj.c);

        // i can access the below because they are on the same class and package , we can access public, default and private
        System.out.println(AccessModifiers.x);
        System.out.println(AccessModifiers.y);
        System.out.println(AccessModifiers.z);


        // public int a; --> only available inside a codeblock, for this reason ACCESS MODIFIERS cannot work with LOCAL VARIABLES
    }

}

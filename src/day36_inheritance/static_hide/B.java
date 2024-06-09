package day36_inheritance.static_hide;

public class B extends A {
    @Override
    public void instanceMethod (){
        System.out.println("instance method form CHILD class");
        staticMethod();
    }


    //@Override - static canNOT be overridden
    public static void staticMethod (){
        System.out.println("Static method from the CHILD class");
    }
}

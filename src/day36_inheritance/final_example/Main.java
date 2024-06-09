package day36_inheritance.final_example;

public class Main {
    public static void main(String[] args) {

        new Parent().walk();
        new Child().walk();


        A obj1 = new A();
        System.out.println(obj1.a);
        B obj2 = new B();
        System.out.println(obj2.b);
        //C obj3 = new C();
        //System.out.println(obj3.a);

    }
}



class Parent {

    public final void walk(){
        System.out.println("Parent Walking");
    }
    // final method - CANNOT BE Overridden in child class.We restrict it.
    // with this restriction, we force all the child class objects to use the same implementation of walk();



    // Cna I overload the final method?
    // Yes,
    public final void walk(int a){
        System.out.println("Parent Walking");
    }



}


class Child extends Parent {

//    @Override
//    public void walk(){
//        System.out.println("Child Walking");
//    }

}



class A {
    int a;
    String b;

    public void tet(){

    }
}


final class B extends A{

}

//class C extends B{
//
//}


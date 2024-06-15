package day39_a_polymorphism.poly;

import day35_inheritance.super_duper.C;

import java.util.Arrays;

class A {
    @Override
    public String toString() {
        return "A";
    }
}

class B1 extends A {
    @Override
    public String toString() {
        return "B1";
    }
}
class B2 extends A {
    @Override
    public String toString() {
        return "B2";
    }
}

class C1 extends B1 {}

class D {
    @Override
    public String toString() {
        return "D";
    }
}


public class PolymorphicArray {
    public static void main(String[] args) {

        String [] str = {"Hi", "Bye"};
        int [] num = {1,2,3};

        D [] obj1 = new D[4]; // i have an array that holds the object of D
        //Declared an array of D lass which can hold objects of D and has size of 4
        obj1[0] = new D(); // assign to the first index the value of D
        System.out.println(Arrays.toString(obj1)); // If i dont have anything inside the class im just printing the memory location--> [day39_a_polymorphism.poly.D@75bd9247, null, null, null]

       // obj1[1] = new C1(); --> CANNOT DO THIS

        A[] obj2 = new A [5]; //POLYMORPHIC array - one parent object can store itself and any child objects
        obj2[0] = new A();
        System.out.println(Arrays.toString(obj2)); // [A, null]
        obj2[1] = new B1(); // B1 has an IS-A relation with A that is why i can do it
        obj2[2] = new B2();
        obj2[3] = new C1(); // yes i can do it bc is  a child

        B1 [] obj3 = new B1 [3];
        obj3[0] = new B1();
        obj3[1] = new C1();
         // obj3[2] = new A(); --> cannot do this because A is a parent
        obj3[2] = (B1)new A(); // here im downcasting
        // obj3[3] = (B1)new B2(); --> Cannot because they are siblings







    }
}

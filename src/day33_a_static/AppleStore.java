package day33_a_static;

public class AppleStore {
    public static void main(String[] args) {
        Iphone phone1 = new Iphone("iPhone 14 Pro", 1099);
        System.out.println(phone1); // Iphone{model='iPhone 14 Pro', price=1099.0}

        Iphone phone2 = new Iphone("iPhone 15", 1199);
        System.out.println(phone2); // Iphone{model='iPhone 15', price=1199.0}

        System.out.println(Iphone.company); // null --> initial value - before we create the static block
        System.out.println(Iphone.os);      // null --> initial value - before we create the static block
    }
}

package day33_b_encapsulation.access_modifiers.login;

public class UseLogin {
    public static void main(String[] args) {

        Login person1 = new Login("loopcamp", "loopAcademy1234!");



        // Since those INSTANCE VARIABLE are "private", I cannot access them directly.
        //System.out.println(person1.username);
        //System.out.println(person1.password); // direct



        System.out.println(person1.getPassword("loopcamp" )); // indirect
        person1.setPassword("loop!camp");
        System.out.println(person1.getPassword("loopcamp" ));

    }
}

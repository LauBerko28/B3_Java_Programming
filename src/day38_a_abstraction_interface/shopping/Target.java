package day38_a_abstraction_interface.shopping;

public final class Target extends Shopping{
    @Override
    public void buyItem() {
        System.out.println("Buying from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Target");
    }
}

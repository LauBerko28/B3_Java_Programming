package day38_a_abstraction_interface.shopping;

public interface Shipping {

    String COUNTRY = "US"; // public static final --> I must initialize it
    public abstract void payForShipping (boolean hasPrime);
}

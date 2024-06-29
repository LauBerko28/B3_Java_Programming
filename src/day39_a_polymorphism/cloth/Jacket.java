package day39_a_polymorphism.cloth;

public class Jacket extends Clothes implements HasHood{
    @Override
    public void wear(){
        System.out.println("Wearing a Jacket....");
    }

    @Override
    public void putOnHood() {
        System.out.println("Putting Jackets Hood on");
    }
}

package day36_inheritance.taxi;

public class LyftXL extends Lyft {
    public LyftXL (String driver) {
        super(driver);
    }


    @Override
    public double calculateRate (int miles){
        return super.calculateRate(miles) * 1.1;
    }

    // super.calculateRate(miles)  - > calls the method in the Lyft class, parent.
    // then we multiply it with 1.1;
}

package day32_custom_classes;

public class TestChaining {
    public static void main(String[] args) {

        // i created the object and it is calling a constructor which has only a print statement that says "First"
        new ChainExample();             // First
        new ChainExample(3);         // First Second
        new ChainExample("Hello"); // First Second Third
        new ChainExample(4.5);

    }
}

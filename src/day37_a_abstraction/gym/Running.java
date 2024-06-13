package day37_a_abstraction.gym;

public class Running extends Exercise{

    public Running(String name) {
        super(name);
    }

    public void performExercise(){
        System.out.println("Running");
    }

    @Override
    public int burningCalories(int minutes) {
        return minutes * 5;
    }
}

package day37_a_abstraction.gym;

public abstract class Exercise {

    String name;

    public Exercise(String name) {
        this.name = name;
    }
    public abstract void performExercise();

    public abstract int burningCalories(int minutes);

}

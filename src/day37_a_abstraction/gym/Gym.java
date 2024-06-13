package day37_a_abstraction.gym;

public class Gym {
    public static void main(String[] args) {

        // Exercise obj1 = new Exercise("Running");

        Running obj1 = new Running("Marathon");
        obj1.performExercise();
        System.out.println(obj1.burningCalories(10));

        PullUps obj2 = new PullUps("Crosfit");
        obj2.performExercise();
        obj2.burningCalories(10);
    }
}

package day37_a_abstraction.gym;

public class PullUps  extends  Exercise{

    public PullUps(String name) {
        super(name);
    }

    public void performExercise(){
        System.out.println("Doing pull ups of " + name);
    }

    public int burningCalories(int minutes){
        return minutes * 15;
    }


}

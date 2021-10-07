package day55_abstraction.exercise_example;



public class FreeWeight extends Lifting{
    @Override
    public void perform() {
        System.out.println("Lifting Free weight dumbbells");
    }

    @Override
    public int getCalories(int minutes) {
        return minutes * 6;
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbbells");
    }
}

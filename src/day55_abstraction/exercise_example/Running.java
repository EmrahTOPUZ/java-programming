package day55_abstraction.exercise_example;

public class Running extends Exercise{

    @Override
    public void perform() {
        System.out.println("Put your running shoes on , and get on the roads");
    }

    @Override
    public int getCalories(int minutes) {
        return 0;
    }
}

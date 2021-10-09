package day56_abstraction;

public class GreetingActions {
    public static void main(String[] args) {
        MountainLanguage mountainLanguage = new MountainLanguage();
        mountainLanguage.hi();
        mountainLanguage.bye();
        Greeting gt = new MountainLanguage();
        gt.hi();
        gt.bye();
    }
}

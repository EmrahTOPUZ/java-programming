package day56_abstraction.greeting;

public class GreetingActions {
    public static void main(String[] args) {
        MountainLanguage mountainLanguage = new MountainLanguage();
        mountainLanguage.hi();
        mountainLanguage.bye();


        Greeting gt = new MountainLanguage();
        gt.hi();
        gt.bye();

        Japanese japanese = new Japanese();
        japanese.hi();
        japanese.bye();

        gt = new Japanese();
        gt.hi();
        gt.bye();
    }
}

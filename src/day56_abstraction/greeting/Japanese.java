package day56_abstraction.greeting;

public class Japanese implements Greeting{

    @Override
    public void hi() {
        System.out.println("Konnicihiwa");
    }

    @Override
    public void bye() {
        System.out.println("Sayonora");
    }
}

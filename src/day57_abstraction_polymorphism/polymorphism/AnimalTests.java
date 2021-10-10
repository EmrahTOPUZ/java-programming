package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.makeNoise();

        Animal animal1 = new Dog();
        Animal animal2 = new Horse();
        Animal cat = new Cat();

        animal1.makeNoise();
        animal2.makeNoise();
        cat.makeNoise();

        List <Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Dog());
        listOfAnimal.add(new Dog());
        listOfAnimal.add(new Horse());
        listOfAnimal.add(new Cat());
        for (Animal each : listOfAnimal) {
            each.makeNoise();
        }
     }
}

package day50_inheritance.overriding;

public class AnimalObj {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Sila";
        animal.type = "Pitbull";
        animal.speak();

        Cat cat = new Cat();
        cat.speak();

        Dog dog = new Dog();
        dog.speak();
    }
}

package day44_custom_classes;

public class AnimalObject {

    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println(animal.type);
        animal.eat();
        animal.eat("fresh meat");
        animal.speak();

        Animal cheetahObj = new Animal();
        cheetahObj.type = "cheetah" ; //change value/reassign to cheetah
        System.out.println(cheetahObj.type);
        cheetahObj.eat("Fresh meat");
    }
}

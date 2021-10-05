package day53_inheritance.Tesla;

public class Roadster extends ElectricCar {

    public Roadster(String model, String make, double price, int year, int range) {
        super(make , model, price, year, range);
        System.out.println("Welcome new Roadster!");
    }
}

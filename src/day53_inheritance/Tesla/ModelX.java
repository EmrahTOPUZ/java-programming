package day53_inheritance.Tesla;

public class ModelX extends ElectricCar {

    public ModelX(String model, String make, double price, int year, int range) {
        super(model, make, price, year, range);
    }

    /**
     * Error below cuz charge is final method cannot be overridden
     */
}

package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();

        //ERROR below, model and year are
        //car1.model = "Nissan Altima";
        //car1.year = 2020;

        car1.setModel("Nissan Altima");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMileage(45230);
        System.out.println("car1 mileage = " + car1.getMileage());

        // Below 2 stataments are both calling toString() method
        System.out.println(car1.toString());
        System.out.println(car1); //Automatically calls toString

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo");
        alfaRomeo.setYear(2020);
        alfaRomeo.setMileage(23456);

        System.out.println(alfaRomeo);
    }
}

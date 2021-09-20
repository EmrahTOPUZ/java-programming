package day48_constructors_static;

public class BusObj {
    public static void main(String[] args) {

        Bus bus = new Bus();
        bus.driver = new Driver("Roberto Carlos");
        bus.engine = new Engine(10);
        System.out.println(bus.toString());

        Bus metroBus = new Bus();
        metroBus.driver = new Driver("George Hagi");
        metroBus.engine = new Engine(15);

        System.out.println(metroBus);

        System.out.println(metroBus.driver.getName());
    }
}

package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {

        int numberOfBedrooms = 2;
        double startingPrice = 0;

        switch (numberOfBedrooms){
            case 0:
                System.out.println("Studio apartment selected. " );
                startingPrice = 1799;
                break;
            case 1:
                System.out.println("1 Bedroom apartment selected. " );
                startingPrice = 2000;
                break;
            case 2:
                System.out.println("2 Bedroom apartment selected.");
                startingPrice = 2500;
                break;
            default:
                System.out.println("5 Bedroom currently unavailable.");
                return;

        }
        System.out.println("Starting price is " + startingPrice + "$");


    }
}

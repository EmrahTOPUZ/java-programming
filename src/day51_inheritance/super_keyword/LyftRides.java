package day51_inheritance.super_keyword;

public class LyftRides {

    public static void main(String[] args) {
        
        Lyft lyftRide = new Lyft();
        LyftXl lyftXlRide = new LyftXl();
        Lux luxRide = new Lux();


        System.out.println("lyftRide.calculateRate(5) = " + lyftRide.calculateRate(5));
        System.out.println("lyftXlRide.calculateRate(5) = " + Math.round(lyftXlRide.calculateRate(5)));
        System.out.println("luxRide.calculateRate(5) = " + luxRide.calculateRate(5));
    }
    
}

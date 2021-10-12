package day58_polymorphism.Online;

public class Amazon extends OnlineShop implements Prime{
    @Override
    void buy() {
        System.out.println("Buying items on Amazon.com");
    }

    @Override
    void sell() {
        System.out.println("Selling items on Amazon.com");

    }

    @Override
    public void primeShipping() {
        System.out.println("Free 2 days shipping for prime users");
    }
}

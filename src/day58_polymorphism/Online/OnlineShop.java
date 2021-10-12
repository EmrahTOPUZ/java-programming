package day58_polymorphism.Online;

public abstract class OnlineShop {
   abstract void buy();
   abstract void sell();
    void ship() {
       System.out.println("Shiping the purchased items");
    }



}

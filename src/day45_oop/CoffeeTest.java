package day45_oop;

public class CoffeeTest {
    public static void main(String[] args) {


        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);
        System.out.println("amount after drink 10 = " + myCoffee.getAmount());
        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee = " + myCoffee.getType());
        System.out.println(myCoffee.toString());

        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());

        Coffee coffee2 = coffee1;

        System.out.println("coffee2 type = " + coffee2.getType());

        coffee2.setType("Espresso");
        System.out.println("coffee2 type = " + coffee2.getType());
        System.out.println("coffee1 type = " + coffee1.getType());

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappe");
        System.out.println("coffee3 type = " + coffee3.getType());

        coffee3 = coffee2 ;
        System.out.println("coffee3 type = " + coffee3.getType());

        Coffee coffee4 = null; // reference variable does not refer/ point to any object in HEAP
        //coffee.setType("Turkish"); //NullPointerException


    }
}
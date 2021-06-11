package day13_conditional_statements;

public class IfWithBoolean {
    public static void main(String[] args) {

        boolean isHungry = true;

        if (isHungry == false) {
            System.out.println("I am hungry I will go get something to eat");
            System.out.println("Then code Java");
        } else {
            System.out.println("I am not hungry, Lets keep coding java");
        }

        double price = 120.00;
        boolean isAffordable = price <= 200;

        if (isAffordable) {
            System.out.println("I can afford it , lets buy");

        } else {
            System.out.println("It is expensive , im broke");
        }

        boolean isRemoteJob = true;

        if (isRemoteJob != true){
            System.out.println("Sorry I am not interested");
        } else {
            System.out.println("Sure I am interested, what is the interview process");
        }

        String city = "Fairfax";
        if (city.equals("Los Angeles")) {
            System.out.println("It is LA");
        } else {
            System.out.println("It is not LA");
        }
    }
}

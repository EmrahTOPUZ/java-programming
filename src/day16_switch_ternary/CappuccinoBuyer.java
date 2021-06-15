package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        String size = "grande";

        double price = 0.0;
        int calories = 0;

        switch (size){
            case "tall":
                System.out.println("Tall cappuccino please");
                price = 1.99;
                calories = 200;
                break;
            case "grande":
                System.out.println("Grande cappuccino please " );
                price = 2.99;
                calories = 300;
                break;
            case "venti":
                System.out.println("Venti cappuccino please");
                price = 3.99;
                calories = 400;
                break;
            default:
                System.out.println("We dont serve that " + size + " cappuccino");

        }
        System.out.println("Total price = " +price+ " calories : " +calories);
        System.out.println("Thank you shopping Starbucks");
    }
}

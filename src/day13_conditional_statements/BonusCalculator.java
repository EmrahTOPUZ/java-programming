package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {


        double bonus = 0;
        double saleAmount = 2000.55;

        if (saleAmount <= 1000) {
            System.out.println("Good job, you qualified for bonus!");
            bonus = 50;// conditional value assignment
        } else {
            System.out.println("Great job, you are qualified for full bonus");
            bonus = 100;
        }
        System.out.println("Your total amount = " + bonus);
    }
}

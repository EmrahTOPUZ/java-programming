package day17_ternary_nested_conditions;

public class VendingMachine {
    public static void main(String[] args) {

        String selection = "snack";
        String drinkItem = "coke";
        String snackItem = "chips";

        if (selection.equals("drink")) {
            System.out.println("drink option is selected");
            if (drinkItem.equalsIgnoreCase("tea")) {
                System.out.println("tea is selected");
            } else {
                System.out.println("Coke item is selected");
            }
        } else if (selection.equals("snack")){
            if (snackItem.equals("chips")) {
                System.out.println("chips item is selected");
            } else {
                System.out.println("peanut item is selected");
            }
        }

    }
}

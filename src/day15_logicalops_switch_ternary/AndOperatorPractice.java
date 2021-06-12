package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {

        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wooden Spoon";

        if (onSale && freeShipping){
            System.out.println("Adding to cart - " +itemName);
        } else {
            System.out.println("Continue shopping for good deals on - " +itemName);
        }
        if (onSale && freeShipping && itemName.equals("Wooden Spoon")) {
            System.out.println("Add to cart only if i like the price");
        } else {
            System.out.println("Continue shopping for good deals");
        }

        //location , salary, remote , benefits


    }
}

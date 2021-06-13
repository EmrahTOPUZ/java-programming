package day15_logicalops_switch_ternary;

public class OrLogicalOperators {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));


        int apples = 5 ;
        int oranges = 7;

        System.out.println(apples > 3 || oranges > 4);

        if (apples > 3 || oranges > 4) {
            System.out.println("No need to buy any fruit today");
        } else {
            System.out.println("Need to get some fruit");
        }

        if (apples > 3 || oranges > 10) {
            System.out.println("Looks like we are good with fruits");
        } else {
            System.out.println("Need to buy some fruits");
        }


    }
}

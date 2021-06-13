package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {

        int age = 2;

        if (!( age > 7)) {
            System.out.println("Need to sit in child car seat. age = " + age);
        } else {
            System.out.println("Can sit normal seat. age = " +age);
        }

        boolean isSmokingAllowed = false;

        if (!(isSmokingAllowed)) {
            System.out.println("Smoking is not allowed here");
        }

        boolean isAffordable = true;

        if (!isAffordable) {
            System.out.println("Item is not affordable");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";

        if (!inputPassword.equals(secretPassword)) {
            System.out.println("incorrect password");
        }

        if (inputPassword.equals("abc123")) {
            System.out.println("Correct password");
        } else {
            System.out.println("In correct passwor d");
        }
    }
}

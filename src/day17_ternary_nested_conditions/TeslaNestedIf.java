package day17_ternary_nested_conditions;

public class TeslaNestedIf {
    public static void main(String[] args) {

        char model = 'S';
        String trim = "Long Range";

        if (model == 'S') {
            if (trim.equals("Long Range")) {
                System.out.println("range     : 412mil");
                System.out.println("top speed : 155mph ");
                System.out.println("0-60      : 3.1sec");
            } else if (trim.equals("Plaid")) {
                System.out.println("range     : 412mil");
                System.out.println("top speed : 155mph ");
                System.out.println("0-60      : 3.1sec");
            } else if (trim.equals("Performance")) {
                System.out.println("range     : 412mil");
                System.out.println("top speed : 155mph ");
                System.out.println("0-60      : 3.1sec");
            }
        }
    }
}

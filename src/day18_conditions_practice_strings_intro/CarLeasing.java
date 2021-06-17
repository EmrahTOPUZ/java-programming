package day18_conditions_practice_strings_intro;

public class CarLeasing {
    public static void main(String[] args) {

        String make = "Audi";
        String model = "A4";
        double leasePrice = 500.0;

        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500.0;
            } else if (model.equals("A")) {
                leasePrice = 400.0;
            }
        } else if (make.equals("Audi")) {
            if (model.equals("S5")) {
                leasePrice = 450.0;
            } else if (model.equals("A4")) {
                leasePrice = 475.0;
            }
        }else {
            System.out.println("Invalid make");
            return;
        }

        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);
    }
}

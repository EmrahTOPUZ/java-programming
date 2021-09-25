package day51_inheritance;

public class Contractor extends Employee{

    /*
    Override annotations
    1) lets everyone know that you are overriding this method
    2) ensures that this method is being overridden, if not it will show error

    */

    @Override
    public double calculateSalary(double rate) {
        return 50 * 40 * rate;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}

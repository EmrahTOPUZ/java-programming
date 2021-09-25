package day51_inheritance;

public class Employee extends Object {

    String jobTitle;


    public double calculateSalary(double rate) {
        return 52 * 40 * rate * 1.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}

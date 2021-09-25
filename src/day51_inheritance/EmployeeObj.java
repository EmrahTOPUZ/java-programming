package day51_inheritance;

public class EmployeeObj {

    public static void main(String[] args) {

        Employee developer = new Employee();
        developer.calculateSalary(55.0);
        double annualSalary = developer.calculateSalary(55.0);
        System.out.println("annualSalary = " + Math.round(annualSalary));


        Contractor contractor = new Contractor();
        double conSalary = contractor.calculateSalary(53.0);
        System.out.println("conSalary = " + conSalary);
    }
}

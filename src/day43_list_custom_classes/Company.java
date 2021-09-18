package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {


        Employee employee1 = new Employee();
        employee1.empName = "Emrah";
        employee1.jobTitle = "SDET";
        employee1.work();

        Employee employee2 = new Employee();
        employee2.empName = "Hayati";
        employee2.jobTitle = "Marangoz";
        employee2.work();

        }
}
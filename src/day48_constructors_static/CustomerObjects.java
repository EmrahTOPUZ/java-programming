package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {
    public static void main(String[] args) {

        Customer customer1 = new Customer();
        System.out.println(customer1.toString()); //prints with default values that are set in no-args constructor
        customer1.setId(1);
        customer1.setName("Bob");
        System.out.println(customer1);

        Customer customer2 = new Customer("Mike" , 2);
        Customer customer3 = new Customer("Emrah" , 67);

        System.out.println(customer2);
        System.out.println(customer3);

        Customer[] customers = {customer1,customer2,customer3,new Customer("Hayati", 7)};



        List<Customer> customerList = new ArrayList<>();
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(new Customer("Emine",54));
        customerList.add(new Customer("Yagmur" , 101));
        customerList.add(new Customer("Enes", 34));

        System.out.println(customerList.toString());

        System.out.println("For loop");

        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }

        System.out.println("For each loop");

        for (Customer customer : customerList) {
            System.out.println(customer);
        }

        for (Customer customer : customerList) {
            System.out.println(customer.getName());
        }

        System.out.println("Names of customer ");
        customerList.forEach(each -> System.out.println(each.getName()));// we cant say just name because it is private

    }
}

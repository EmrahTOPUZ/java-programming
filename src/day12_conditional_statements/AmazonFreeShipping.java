package day12_conditional_statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter total price");

        double totalPrice = scan.nextDouble();

        if (totalPrice >= 25) {
            System.out.println("Free shipping eligible , your order total: 55");
        } else {
            System.out.println("not eligible for free shipping , order total is less than 25");
        }
    }
}

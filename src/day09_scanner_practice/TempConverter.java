package day09_scanner_practice;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("### F to C CONVERTER PROGRAM ");
        System.out.println("Enter Fahrenheit value:");
        double fahrenheitValue = scan.nextDouble();
        double celsiusValue = (fahrenheitValue - 32) * 5 / 9;

        System.out.println(fahrenheitValue + " F is in C " + celsiusValue);

    }
}

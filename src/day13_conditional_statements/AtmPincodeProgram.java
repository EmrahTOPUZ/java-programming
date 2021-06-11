package day13_conditional_statements;

import java.util.Scanner;

public class AtmPincodeProgram {
    public static void main(String[] args) {
        System.out.println("###### WELCOME TO CHASE ######");

        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER YOUR PINCODE");
        int secretPincode = 1234;
        int inputPincode = scan.nextInt();



        if (secretPincode == inputPincode) {
            System.out.println("Your Pin is correct");
            System.out.println("WELCOME TO YOUR ACCOUNT");
        } else {
            System.out.println("Your Pin is incorrect");
            System.out.println("Please try again");
        }

        System.out.println("THANk YOU FOR USING CHASE ATM");


    }
}

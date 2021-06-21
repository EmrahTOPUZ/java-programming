package day24_loops;

import java.util.Scanner;

public class GiveMe5Dollar {
    public static void main(String[] args) {

        Scanner  scan = new Scanner(System.in);
        System.out.println("Give me 5 dollar");
        int dollar = scan.nextInt();

        while (dollar != 5) {

            System.out.println("Give me 5 dollar");
            dollar = scan.nextInt();
        }
        System.out.println("Thank you for 5 dollar");
    }
}

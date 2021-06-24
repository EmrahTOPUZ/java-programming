package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {

        for (int i = 0; i <= 100 ; i++) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n ODD NUMBERS");

        for (int i = 0; i <= 100 ; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

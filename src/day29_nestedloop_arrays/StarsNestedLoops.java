package day29_nestedloop_arrays;

public class StarsNestedLoops {
    public static void main(String[] args) {


        for (int star = 1; star <= 5 ; star++) {
            for (int stars = 1; stars <= 10 ; stars++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int outer = 1; outer <= 10 ; outer++) {
            for (int inner = 1; inner <= outer ; inner++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int outer = 1; outer <= 10 ; outer++) {
            for (int inner = 10; inner >= outer ; inner--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        int number = 11;

        if (number < 1 || number > 10) {
            System.out.println("Error: invalid input");
            return;
        }
        for (int num = 1; num <= 10 ; num++) {
            System.out.println(number +" x " + num + " = "+ (number*num));
        }

    }
}

package day24_loops;
import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) throws InterruptedException {

        Random randomNumber = new Random();
        Scanner scan = new Scanner(System.in);

        int secretNumber = randomNumber.nextInt(101);
        int guessingNumber = 0;
        int count = 0;


        do {
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();

            if (guessingNumber > secretNumber) {
                System.out.println("Wrong your number is too large ");
            }else if(guessingNumber < secretNumber)
                System.out.println("Wrong your number is too small ");




        }while (secretNumber != guessingNumber);

        System.out.println("Congrats the number is "+ secretNumber);



    }
}

package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "QWERTYUIOPLKJHGFDAZXCVBNMqwertyuioplkjhgfdsazxcvbnm!@#$%^&*()><?/";

        Random random = new Random();
        String passWord = "";

        for (int code = 1; code <= 8; code++) {
          int index = random.nextInt(source.length());
            //System.out.print(source.charAt(index));

            passWord += source.charAt(index);
        }

        System.out.println("\nYour password is " + passWord);
    }
}
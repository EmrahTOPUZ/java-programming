package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "today is java class and we are coding for loops";

        for (int i = 0 ; i < word.length() ; i++) {
            System.out.print(i + " " +word.charAt(i));

        }
        System.out.println();
        word = "Emrah";
        for (int i = word.length()-1; i >= 0 ; i--) {
            System.out.print("" +word.charAt(i));

        }
    }
}

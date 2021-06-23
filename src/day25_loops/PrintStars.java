package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for (int i = 1; i <= 15 ; i++) {
            System.out.print( "\ud83c\uDF1F ");

        }
        System.out.println();
        String myStars = "";

        for (int n = 0; n <= 5 ; n++) {
            myStars += "\ud83c\uDF1F ";

        }
        System.out.print("my stars = " +myStars.trim() );
    }
}

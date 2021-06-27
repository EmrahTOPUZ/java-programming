package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) {

       for (int minute = 0; minute <= 5 ; minute++) {
           System.out.println("\nminute = " + minute);
          for (int seconds = 1; seconds <= 60 ; seconds++) {
                System.out.print("seconds = " + seconds);
            }
        }

        for (int minutes = 0; minutes <= 4 ; minutes++) {
            for (int second = 0; second < 60 ; second++) {
                System.out.println("00:"+minutes+ ":"+second);

            }

        }
    }
}

package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Lets watch World's smallest cat \uD83D\uDC08- BBC");

        int second = 0;

        while (second <= 117) {
            System.out.println("Watching Youtube \uD83D\uDC08 video: " +second+ " seconds");
            //Thread.sleep(300);
            second++;
        }

        int count = 5;

        while (count >= 0) {
            System.out.println("Counting backward " +count);
            count--;
        }


        int unReadSms = 23;
        System.out.println("23 messages on my box \uD83D\uDC8C");

        while (unReadSms >= 0) {
            System.out.println("Keep reading messages " +unReadSms+ " \uD83D\uDC8C");
            unReadSms--;
        }
        System.out.println("read all the messages");

    }
}

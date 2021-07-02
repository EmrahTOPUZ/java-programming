package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {

        double [] prices = {22,9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String [] countries = {"China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};

        for ( double each : prices){
            if (each > 100) {
                System.out.println(each + " ");
            }
        }

        System.out.println("\n --- prices between 10 and 70 ---");

        for (double eachPrice : prices){
            if (eachPrice > 10 && eachPrice < 70){
                System.out.println(eachPrice + " ");

            }
        }
          int count = 0;
        for (double purchased : prices){
            if (purchased > 50 ){
                count++;
            }
        }
        System.out.println("count = " + count);

        System.out.println("\n ---- Inclusive country names");

        for ( String names : countries){
            if (names.length() >= 7) {
                System.out.println(names + " ");
            }
        }

    }
}

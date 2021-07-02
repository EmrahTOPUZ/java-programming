package day32_arrays_split;

public class MinimumPrice {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iPhone 11 case"};

        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};

        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        double minPrice = 99.99;
        int indexOfMinPrice = 0;

        for (int i = 0 ; i < prices.length; i++){
            if (prices[i] < minPrice){
                minPrice = prices[i];
                indexOfMinPrice = i;
            }
        }
        System.out.println("minPrice = " + minPrice);
        System.out.println(items[indexOfMinPrice] + " - " + prices[indexOfMinPrice] + " - " + itemIDs[indexOfMinPrice]);
    }
}

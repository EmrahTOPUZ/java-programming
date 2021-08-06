package day32_arrays_split;

public class ShoppingItems {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iPhone 11 case"};

        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};

        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("----------FIND THE INDEX OF 'GLOVES' in item array ----");

        for (int i = 0; i < items.length - 1; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("gloves found at index - " + i);
                break;
                // System.out.println(i + " - " +items[i]);
            }
        }

        boolean iPadExist = false;
        for (String each : items){
            if (each.equalsIgnoreCase("Ipad")){
                iPadExist = true;
                break;
            }
        }
        System.out.println("iPadExist = " + iPadExist);

        if (iPadExist) {
            System.out.println("We bought the ipad");
        }else {
            System.out.println("We bought the ipad");
        }

        System.out.println("----Print the report----" );



        for (int i = 0 ; i < items.length ; i++){
            System.out.println(items[i] + " - " +prices[i]+ " - " + itemIDs[i]);
        }

        for (int i = 0 ; i < items.length ; i++){
            if (items[i].equals("Jacket")) {
                System.out.println(items[i] + " - " +prices[i]+ " - " + itemIDs[i]);
                break;
            }
        }

        for (int et = 0 ; et < items.length ; et++){
            if (items[et].equals("Shoes")) {
                System.out.println(items[et] + " - " +prices[et]+ " - " + itemIDs[et]);
                break;
            }
        }
    }}
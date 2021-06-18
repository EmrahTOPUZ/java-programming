package day19_string_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {

        String city = "Istanbul";
        System.out.println(city.equals("Istanbul"));
        System.out.println(city.equals("ISTANBUL"));
        System.out.println(city.equals("IsTAnBul"));

        System.out.println(city.equalsIgnoreCase("Istanbul"));
        System.out.println(city.equalsIgnoreCase("ISTANBUL"));
        System.out.println(city.equalsIgnoreCase("IsTAnBul"));
        System.out.println(city.equalsIgnoreCase("iISTANbul"));

        if (city.equals("Istanbul")) {
            System.out.println("equals () true");
        }else{
            System.out.println("equals () false");
        }

        if (city.equalsIgnoreCase("ISTANBUL")) {
            System.out.println("equalsIgnoreCase () true");
        } else {
            System.out.println("equalsIgnoreCase () false");

        }
    }
}

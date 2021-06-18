package day20_String_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capitol One";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l O"));
        System.out.println(company.contains("j"));


        if (company.contains(" ")) {
            System.out.println(company + " contains space.");
        }else{
            System.out.println(company + " does not contains space.");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        if (etsyTitle.contains(" | ")) {
            System.out.println("Title check is passed");
        }else{
            System.out.println("Title check is failed");
        }
        String firstName = "Emrah";
        if (firstName.contains("E") && firstName.contains("a")) {
            System.out.println(firstName+ " contains 'E' and 'a'");
        }else{
            System.out.println(firstName+ " does not contains 'E' and 'a'");

        }
        firstName = "topuz";

        if (firstName.contains("t") || firstName.contains("a")) {
            System.out.println(firstName+ " contains 't' or 'a'");
        }else{
            System.out.println(firstName+ " does not contains 't' or 'a'");
        }

        String email = "emrtpz@gmail.com";

        if (email.contains("@") && email.endsWith("com")) {
            System.out.println(email + " passes the requirements");
        }else {
            System.out.println(email + " failed the requirements");
        }

        if (email.toLowerCase().contains("d")) {
            System.out.println(email + " passes the requirements");
        }else {
            System.out.println(email + " failed the requirements");
        }
    }
}

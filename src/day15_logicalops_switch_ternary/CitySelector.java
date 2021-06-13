package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Istanbul";

        if (city.equals("Istanbul") || city.equals("Antalya")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("I wont back to go my country");
        }

        String teacher = "Akbar";

        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("Java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Softskill class with " + teacher);
        }else {
            System.out.println("Some other class with " + teacher);
        }

        String company = "Google";
        double salary = 120_000;

        if (company.equals("Google") || salary >= 120_000) {
            System.out.println("I want to work for this company");
        }else {
            System.out.println("I dont want to work for this company");

        }
    }
}

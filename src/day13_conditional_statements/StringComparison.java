package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Beycuma";
        if (city.equals("Beycuma")) {
            System.out.println("Beni koyumun yagmurlarinda yikasinlar");
        } else {
            System.out.println("Baska yerde yasayamam");
        }

        String weather = "sunny";
        if (weather.equals("sunny")) {
            System.out.println("Lets beet Italy today");
        } else {
            System.out.println("Diger turlu dusunemiyorum");
        }
    }
}

package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {

        String weather = "windyz";

        if (weather.equals("sunny")) {
            System.out.println("The weather is beautiful");
        } else if (weather.equals("rainy")) {
            System.out.println("The weather is rainy");
        } else if (weather.equals("snowy")) {
            System.out.println("Lets go skii");
        } else if (weather.equals("windy")) {
            System.out.println("The weather is gusty, slow down");
        }else {
            System.out.println("Just keep coding Java");
        }
    }
}

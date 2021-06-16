package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String reply = (hourlyRate >45) ? "accept" : "reject";
        System.out.println("reply = " + reply);

        String todasyClass = "java";
         String teacher = todasyClass.equals("java") ? "Murodil/Saim" : "Nadir";
        System.out.println("teacher = " + teacher);

        boolean isEligibleToDrive = true;

        String driving = isEligibleToDrive ? "have DL, can drive" : "No Dl , cannot drive";
        System.out.println("driving = " + driving);

    }
}

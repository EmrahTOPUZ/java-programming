package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {

        int score1 = 75;
        String result1;
        if (score1 >60) {
           result1 = "pass";
        } else {
            result1 = "Fail";
        }

        //With ternary

        int score = 88;
        String result = (score > 60) ? "PAss" : "Fail";
        System.out.println("result = " + result);

        String quality = "good";
        System.out.println(quality.equals("good") ? 100 : 0);

        int rating = quality.equals("good") ? 100 : 0;
        System.out.println("rating = " + rating);

        int score3  = 100;
        char grade = (score > 90) ? 'A' : 'B';
        System.out.println("grade = " + grade);
    }
}

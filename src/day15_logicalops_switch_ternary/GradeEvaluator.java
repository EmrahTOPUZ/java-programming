package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {

        char grade = 'E';

        if (grade == 'A' || grade == 'B' || grade =='C') {
            System.out.println("Passed with the grade " + grade);
        } else if (grade == 'D') {
            System.out.println("Qualify for retake");
        } else if (grade == 'E') {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid grade");
        }


    }
}

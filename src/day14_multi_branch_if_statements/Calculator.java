package day14_multi_branch_if_statements;

public class Calculator {
    public static void main(String[] args) {

        double num1 = 6.7;
        double num2 = 3.4;
        char operator = '+';

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        }else{

        }

    }
}

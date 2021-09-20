package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {

        // add is static method can be called Classname.method
        // static way of calling method
        Calculator.add(5,5);

        //Calculator.multiply(8, 2); ERROR multiply is not static, need object to call it
        // multiply is instance method we are creating object then calling it
        Calculator calculator = new Calculator();
        calculator.multiply(8,2);

    }
}

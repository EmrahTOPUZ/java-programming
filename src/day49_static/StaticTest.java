package day49_static;

public class StaticTest {

     static String word = "java";

    public static void main(String[] args) {

        // static method can be called using classname
        StaticMethod.displayMessage("Alex De Souxa");
        // instance method needs an object to be called
        //StaticMethod.instanceMethod() ; // ERROR

        StaticMethod stm = new StaticMethod();
        stm.instanceMethod();

        // static method can only access other static variables and methods
        System.out.println(word);
    }
}

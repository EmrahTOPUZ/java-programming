package day49_static;

public  class StaticTest {
    String word = "java";
    public static void main(String[] args) {
        //1 ) static method can be called using classname
        StaticMethods.displayMessage("Wodden spoon");
        //2) instance method needs an object to be called
        //StaticMethods,instanceMethods
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();
    }
}

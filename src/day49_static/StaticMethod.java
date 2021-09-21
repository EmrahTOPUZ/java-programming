package day49_static;

public class StaticMethod {

    int num = 10;
    static int count = 5;


    public static void displayMessage(String message) {
        System.out.println("message: " + message  );
        //System.out.println("num = " + num); // ERROR : num is instance variable static cant access
        System.out.println("count " + count); // no- ERROR. count is static variable
    }

    public static void anotherStaticMethod() {
        System.out.println("another static method");
        displayMessage("wooden spoon");

    }

    // StaticMethod.instanceMethod(); > no
    //

    public void instanceMethod() {
        System.out.println("Instance Method");
        System.out.println("num = " + num);
        System.out.println("count = " + count);

    }
}

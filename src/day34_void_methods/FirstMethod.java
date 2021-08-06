package day34_void_methods;

public class FirstMethod {

    public static void main(String[] args) {
        displayMessage(); // calling the method
        displayMessage(); // everytime we call the methods it will print what is in that method

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " - ");
            displayMessage();
        }
    }

    // custom reusable method
    public static void displayMessage() {
        System.out.println("Hello B-22 Friends");
    }
}

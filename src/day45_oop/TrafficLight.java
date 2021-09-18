package day45_oop;

public class TrafficLight {
    String color;
    // this is read only method, displays value of color variable
    public void showColor() {
        System.out.println("current color = " + color);
    }

    public void changeColor(String newColor) {
        System.out.println("Changing color to " + newColor);
        color = newColor;
    }
}

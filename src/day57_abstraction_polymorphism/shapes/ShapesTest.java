package day57_abstraction_polymorphism.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        drawShape(new Circle());
        drawShape(new Square());
        drawShape(new Triangle());
        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        List<Shape> listOfShapes = new ArrayList<>();
        listOfShapes.add(new Triangle());
        listOfShapes.add(new Square());
        listOfShapes.add(new Square());
        listOfShapes.add(new Circle());
        for (Shape each : listOfShapes) {
            each.draw();
        }
    }

    public static void drawShape(Shape shape) {
        System.out.println("----Drawing shape---");
        shape.draw();


    }
}
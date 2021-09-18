package day45_oop;

public class TrafficLightOBJ {
    public static void main(String[] args) {
        //create traffic light obj

        TrafficLight trafficLight = new TrafficLight();

        trafficLight.changeColor("red ");

        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight1 = new TrafficLight();
        trafficLight1.changeColor("blue");
        trafficLight1.showColor();
    }
}

package day56_abstraction.driveable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {


    @Override
    public void autoPiloting() {
        System.out.println("Flying on Auto-Pilot mode transport people");
    }

    @Override
    public void transportPeople() {
        System.out.println("Flying people from one place to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println();
    }

    @Override
    public void hi() {

    }

    @Override
    public void bye() {

    }
}


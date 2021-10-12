package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        //variable of worker, object of Superman

        Workable worker = new SuperMan();
        worker.work("QA Manager");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ((SuperMan)worker).playWithKid();

        SuperMan superMan = (SuperMan) worker; // Downcasting from worker to Superman
        superMan.work("Java Dev");


    }
}

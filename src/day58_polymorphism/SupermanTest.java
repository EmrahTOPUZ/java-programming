package day58_polymorphism;

public class SupermanTest {
    public static void main(String[] args) {
        Father sdet = new SuperMan();
        sdet.playWithKid();
        sdet.feedKid();
        sdet.raiseKid();
        //sdet.work("SDET"); ERROR; sdet is Father type can only access methods in father


        Workable sdet1 = new SuperMan();
        sdet1.work("SDET");
        System.out.println("Got paid $ " + sdet1.getPaid());

        SuperMan sdet2 = new SuperMan();
        sdet2.getPaid();
        sdet2.feedKid();
        sdet2.work("Scrum Master");
        sdet2.playWithKid();
        sdet2.raiseKid();


    }
}

package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {

        int floorNum = 4;

        if (floorNum == 1) {
            System.out.println("Floor 1 selected: Companies : Lobby , NASA , Starbucks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected: Companies : Cybertek, Verizon, Durumcu baba");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected: Companies : GALATASARAY, OCTOPUZZ, MORTON");
        } else {
            System.out.println("Invalid floor number " + floorNum);
        }

        floorNum = 2;
        switch (floorNum){
            case 1:
                System.out.println("Floor 1 selected: Companies : Lobby , NASA , Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected: Companies : Cybertek, Verizon, Durumcu baba ");
                break;
            case 3:
                System.out.println("Floor 3 selected: Companies : GALATASARAY, OCTOPUZZ, MORTON  ");
                break;
            default:
                System.out.println("Invalid floor number " + floorNum);




        }
    }
}

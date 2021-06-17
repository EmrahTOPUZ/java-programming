package day18_conditions_practice_strings_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {

        int month = 17;

        switch(month){
            case 12:
            case 1:
            case 2:
                System.out.println("It is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It is Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It is fall ");
                break;
            default:
                System.out.println("Invalid season");
        }
    }
}

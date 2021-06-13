package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {


        String location = "Austin";
        double salary = 100_000;
        boolean isRemote = true;
        boolean hasBenefits = true;


        if (location.equals("Austin") && isRemote && salary >= 100_000 && hasBenefits) {
            System.out.println("Boyle bi ise ben neden hayir diyeyim");
        } else {
            System.out.println("Bunlar yoksa calismiyprum");
        }

        String team = "Galatasaray";
        double bonservis = 10_000_000;
        int formaNo = 10;
        boolean ilk11 = true;

        if (team.equals("Galatasaray") && bonservis >= 10_000_000 && formaNo == 10 && !ilk11 ) {
            System.out.println("Yeni transfer EmrahTOPUZ hayallerindeki takima transfer oldu");
        } else {
            System.out.println("Transfer gerceklesmedi");
        }
    }
}

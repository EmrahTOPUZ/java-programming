package Officehours.Practice_03_02_2021;

public class PersonInfo {
    public static void main(String[] args) {

        String name, fullBirthdate, favoriteQuote;
        byte age;
        char gender ;
        boolean student ;
        short sibling ;
        long favoriteNum ;
        int seasons, year;
        double birthdate ;


        name = "Emrah Topuz";
        age = 33;
        gender = 'M';
        student = true;
        sibling = 1;
        favoriteNum = 67L;
        seasons = 4;
        birthdate = 07.08;
        year = 1987;
        fullBirthdate = "0" + birthdate + "." + year; // add first then turns to String
        favoriteQuote = "always positive";

        System.out.println("Name = " + name);
        System.out.println("Full Birthdate = " + fullBirthdate);
        System.out.println("He is " + age + " years old.");
        System.out.println("He is a " + gender);
        System.out.println("He is a student in Cybertek " + student );
        System.out.println("He has only " + sibling + " sibling.");
        System.out.println("His favorite number is " + favoriteNum + " cuz he is from Zonguldak");
        System.out.println("He lives in Delaware, they have all the " + seasons + " seasons in there.");
        System.out.println("This guy is funny and " + favoriteQuote + " about life");







    }
}

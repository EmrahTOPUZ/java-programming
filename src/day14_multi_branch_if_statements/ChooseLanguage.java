package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {

        System.out.println("Choose your language");

        int selection = 3;
        if (selection == 1) {
            System.out.println("Hello Thank you for your call");
        } else if (selection == 2) {
            System.out.println("Hola , gracias para lamar");
        } else if (selection == 3) {
            System.out.println("Merhaba aradigniz icin tesekkurler");
        } else if (selection == 4) {
            System.out.println("spasiba, zo vash vodok");
        }else {
            System.out.println("Aradiginiz icin tesekkurler");
        }
    }
}

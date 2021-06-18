package day20_String_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {

        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);

        if (jobTitle.isEmpty()) {
            System.out.println("Job title is missing, please resend");
        }else {
            System.out.println("Job title looks good");
        }

        if (jobTitle.length() == 0) {
            System.out.println("Job title is empty");
        } else {
            System.out.println("Job title is not empty");
        }

        System.out.println(jobTitle.equals(""));

        if ("".equals(jobTitle)) {
            System.out.println("Job title is empty");
        }else {
            System.out.println("Job title is not empty");
        }

        String word = " ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie = "tomato";
        System.out.println(veggie.isEmpty());
        if (!veggie.isEmpty()) {
            System.out.println("We have some " +veggie);
        }

        String language = "Turkish";
        System.out.println(language.contains("u"));
        System.out.println(language.contains("uk"));

        if (language.contains("ur")) {
            System.out.println("Whatever Im looking at is here");
        }else{
            System.out.println("There is no in this word");
        }
    }
}

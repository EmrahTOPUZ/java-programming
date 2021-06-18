package day19_string_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {

        String word = "CyberTEK";
        String sentence = "JAVA IS FUN";

        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLCase = word.toLowerCase();
        System.out.println("wordInLowercase = " + wordInLCase);

        // change word to all lowercase letters, and assign back.
        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon Web Services";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        System.out.println("company = " + company);;
        company = company.toUpperCase();
        System.out.println("company = " + company);

    }
}

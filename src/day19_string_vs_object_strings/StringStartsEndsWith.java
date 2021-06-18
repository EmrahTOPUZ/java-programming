package day19_string_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {

        String word = "intelliJ idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij"));
        System.out.println("java".startsWith("j"));

        System.out.println(word.endsWith("idea"));
        System.out.println(word.endsWith("a"));

        String name = "Irina";
        if (name.endsWith("a")) {
            System.out.println("Most likely it is a female name");

        }
        String firstName = "Dr.Emrah";
        if (firstName.startsWith("Mr")) {
            System.out.println("It is a man");
        } else if (firstName.startsWith("Dr")) {
            System.out.println("It is a doctor");
        } else if (firstName.startsWith("Mrs")) {
            System.out.println("It is a Married woman");
        } else if (firstName.startsWith("Ms")) {
            System.out.println("It is a single woman");
        } else if (firstName.startsWith("Sr")) {
            System.out.println("It is a senior");
        }else{
            System.out.println("just  a regular name");
        }
        /**
         * String url = hhtps //www.epicgames.com/activate
         * .com -> "Commercial website
         * .ru -> "Russian website
         * .gov -> "Goverment website
         * .edu -> "Education website
         *
         */
        String URl = "hhtps //www.epicgames.com";

        if (URl.endsWith(".com")) {
            System.out.println("Its a commercial website");
        } else if (URl.endsWith(".ru")) {
            System.out.println("Its a Russian website");
        } else if (URl.endsWith(".gov")) {
            System.out.println("Its a Government website");
        } else if (URl.endsWith(".edu")) {
            System.out.println("Its a education website");
        } else if (URl.endsWith(".ru")) {
            System.out.println("Its a Russian website");
        } else if (URl.endsWith(".org")) {
            System.out.println("Its a organizational website");
        }else {
            System.out.println("Dont know what kind of website");
        }

    }
}

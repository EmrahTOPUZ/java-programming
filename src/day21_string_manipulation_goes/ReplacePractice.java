package day21_string_manipulation_goes;

public class ReplacePractice {
    public static void main(String[] args) {
        String word  = "github";
        System.out.println(word.toUpperCase());

        System.out.println(word.replace("hub", "lab"));
        System.out.println("word = " + word);

        word = word.replace("hub" , "lab");
        System.out.println(word);

        System.out.println(word.replace("i", "o".replace("a", "i")));

        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" ", "".replace(" ", ""));
        System.out.println(withNoSpace);

        sentence = sentence.replace("java" , "Selenium").replace("fun" , "a lots fun");
        System.out.println("sentence = " + sentence);

        String result = "1-48 of over 4,000 results for java book" ;
        result = result.replace("1-48 of over ", "").replace("," , "").replace("  results for java book", "");
        System.out.println(result);


    }
}

package day20_String_manipulation;

public class StringReplace {
    public static void main(String[] args) {

        String sentence = " java Strings are fun";
        System.out.println(sentence);
        System.out.println(sentence.replace("a", "u"));
        System.out.println(sentence.replace("String" , "conditions"));

        String arab = "Emre";
        System.out.println(arab.replace("Emre" , "monkey"));


    }
}

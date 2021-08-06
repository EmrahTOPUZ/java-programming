package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {


        String sentence = " java id fun";
        String [] words = sentence.split(" ");
        System.out.println("1st word = " + words[0] );
        System.out.println("2nd word = " + words[1] );
        System.out.println("3rd word = " + words[2] );

        for (String words1 : words){
            System.out.println(words1);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String [] google = googleResult.split(" ");
        System.out.println("Count = " +google[1]);
        System.out.println("Count 2 = " +google[3].replace("(", ""));



    }
}

package day32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "java is fun";
        String [] sentenceArray = sentence.split(" ");
        String reversed = "";


        for (int i = sentenceArray.length -1 ; i >= 0 ; i--){
            System.out.print(sentenceArray[i] + " ");
            reversed += sentenceArray[i];

        }

        System.out.println("sentence = " + sentence);
        System.out.println("reversed = " + reversed.trim());
    }
}

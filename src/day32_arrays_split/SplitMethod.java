package day32_arrays_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {

        String words = "java:python:selenium:html";
        String [] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("Length of array = " + wordsArray.length);

        String sentence = "today I am coding java arrays";
        String [] sentenceArray = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));

        for (String each : sentenceArray){
            System.out.print(each + " ");
        }

        System.out.println();

        for (String each1 : wordsArray){
            System.out.print(each1 + " ");
        }

        System.out.println();

        String sentence2 = "I feel good today";
        String [] sentence2Array = sentence2.split(" ");
        System.out.println("first word: " + sentence2Array[0]);
        System.out.println("first word: " + sentence.split(" ")[0]);
        System.out.println("Number of words in sentence = " + sentence2Array.length);

        for (String each : sentence2Array){
            System.out.println(each + " ");
        }
    }
}

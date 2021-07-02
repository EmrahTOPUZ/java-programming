package day31_arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {

        int [] nums = { 7,2,87,56,23,97,63,12,34,};

        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


        String [] words = {"Los Angeles", "Miami", "Istanbul", "Antalya"};
        System.out.println(Arrays.toString(words));
        System.out.println("[" +String.join(",", words)+"]");

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words ));
    }

}

package day33_arrays;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {

        int nums1 = 10;
        int nums2 = 30;

        System.out.println("nums1 = " + nums1);
        System.out.println("nums2 = " + nums2);

        int temp = nums1;

        nums1 = nums2;
        nums2 = temp;

        System.out.println("nums1 = " + nums1);
        System.out.println("nums2 = " + nums2);


        int [] nums = {5, 10, 4, 100};

        System.out.println("before swap: " + Arrays.toString(nums));

        temp = nums[0];
        nums[0] = nums[3];
        nums[3] = temp;

        System.out.println("after 1st and last swap " +Arrays.toString(nums));

        int[] num2 = {5, 10, 4, 100};

        for (int i = 0; i < num2.length ; i++) {
            int temp2 = num2[i];
            num2[i] = num2[num2.length -1 - i];
            num2[num2.length -1 - i] = temp2;
        }

        System.out.println("After: " + Arrays.toString(num2));

        String [] words = {"java" , "html", "js", "ruby", "css" };
        System.out.println("before reverse words = " + Arrays.toString(words));

        for (int i = 0, j = words.length -1; i < words.length/2; i++ , j--){
            String tempWord = words[1];
            words[i] = words[j];
            words[j] = tempWord;
        }

        System.out.println("words after reverse = " +Arrays.toString(words));



    }
}

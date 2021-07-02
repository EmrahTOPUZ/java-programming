package day31_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int [] nums = {2, 34, 45, 67, 7867, 87638, 1};
        System.out.println(Arrays.binarySearch(nums, 45));
        System.out.println(Arrays.binarySearch(nums, 87638));
        System.out.println(Arrays.binarySearch(nums, 10));
        System.out.println(Arrays.binarySearch(nums, 100));

        if (Arrays.binarySearch(nums, 34) >= 0) {
            System.out.println("34 is present in the arrays");
        }else{
            System.out.println("34 is not present");
        }
    }
}

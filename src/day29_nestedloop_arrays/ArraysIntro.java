package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int num = 10; // single variable
        int [] nums = new int[3]; // Array variables

        nums [0] = 5;
        nums [1] = 7;
        nums [2] = 10;
        //nums [3] = 100; // ArraysIndexOutOfBoundsException
        System.out.println("value at index 0 = " +nums[0]);
        System.out.println("value at index 1 = " +nums[1]);
        System.out.println("value at index 2 = " +nums[2]);

        int i = 0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums[i]);

        System.out.println("number of elements = " +nums.length);

        int  len = nums.length;
        System.out.println("len = " + len);

        nums [0] = 200;
        nums [1] = 300;
        nums [2] = 400;
        nums [2] = nums [1];

        System.out.println("nums [0] = " + nums[0]);
        System.out.println("nums [1] = " + nums[1]);
        System.out.println("nums [2] = " + nums[2]);



    }
}

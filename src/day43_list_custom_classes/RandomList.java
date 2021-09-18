package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList {
    public static void main(String[] args) {
        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n < 90);
        System.out.println("nums = " + nums);
    }

    public static List<Integer> getRandomList(int size) {
        Random random = new Random();

        List<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= size; i++) {
//            int n = random.nextInt(101);
//            if (!nums.contains(n)) {
//                nums.add(n);
//            }
            nums.add(random.nextInt(101)); //generate random number and add to list

        }
        return nums;
    }
    }


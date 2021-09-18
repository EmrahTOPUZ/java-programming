package day42_arraylist;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithList {

    public static void main(String[] args) {
        List<Integer> mlnNums =  getIntegerList();
        getIntegerList();


    }


    public static List<Integer> getIntegerList() {

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i <= 1_000_000; i++) {

            nums.add(i);

        }
        return null;
    }


}

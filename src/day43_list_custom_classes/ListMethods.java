package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethods {

    public static void main(String[] args) {
        System.out.println(getNums());
        getNums().removeIf(n -> n > 10);
        System.out.println(getNums());

        System.out.println(getDays().size());
        System.out.println("getDays().get(0) = " + getDays().get(0));
        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("Java Day");


    }
    public static List<String> getDays(){
        List<String> days = new ArrayList<>(Arrays.asList("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"));
        return days;
    }

    public static List<Integer> getNums(){
        List<Integer> nums = new ArrayList<>();
        nums.add(35);
        nums.add(43);
        nums.add(54);
        nums.add(289);
        return nums;
    }

}

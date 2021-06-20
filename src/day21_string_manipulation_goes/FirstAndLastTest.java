package day21_string_manipulation_goes;

public class FirstAndLastTest {
    public static void main(String[] args) {

        String word2 = "mom";
        char first1 = word2.charAt(0);
        char last = word2.charAt(2);

        if (first1 == last ){
            System.out.println("first and last letters match");
        }else{
            System.out.println("first and last letters mismatch");
        }

        String friend = "aziza";
        char firstLetter = friend.charAt(0);
        int count = friend.length();
        char lastLetter = friend.charAt(count-1);
        System.out.println(firstLetter);
        System.out.println(lastLetter);

        if (firstLetter == lastLetter) {
            System.out.println(friend + "first and last match");
        }else {
            System.out.println(friend + "first and last mis match");

        }
    }
}

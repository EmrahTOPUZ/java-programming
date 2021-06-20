package day22_String_manipulation_keeps;

public class ReverseUsingCharAt {
    public static void main(String[] args) {

        String word = "noon";
        char first = word.charAt(0);
        char second = word.charAt(1);
        char third = word.charAt(2);
        char fourth = word.charAt(3);
        System.out.println(fourth+ "" +third+ "" +second+ "" +first);

        System.out.print(word.charAt(3));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.println(word.charAt(0));
        System.out.println(word);

        System.out.println(""+word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0) );

        String reversed = ""+word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);

        System.out.println("word = " + word);
        System.out.println("reversed = " + reversed);

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome word");
        }else {
            System.out.println("Not Palindrome word");
        }
    }
}

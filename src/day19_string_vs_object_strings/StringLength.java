package day19_string_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {

        String myName = "emrah Topuz";
        System.out.println(myName);
        System.out.println(myName.length());

        System.out.println("count: " + myName.length());
        System.out.println("GALATASARAY".length());

        int count = myName.length();
        System.out.println("count = " + count);

        String password = "abc123";
        if (password.length() >= 6){
            System.out.println("Valid amazon password");
        }else {
            System.out.println("Invalid amazon Password");
        }
    }
}

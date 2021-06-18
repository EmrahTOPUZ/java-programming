package day19_string_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {

        String expUsername = "cybertek";
        String expPassword = "Abc123";

        String userName = "Cybertek";
        String password = "Abc124";

        if (expUsername.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("Pass - User successfully logged in");
        }else {
            if (!expUsername.equalsIgnoreCase(userName)) {
                System.out.println("username incorrect");
            }else{
                System.out.println("password incorrect");
            }

        }


    }
}

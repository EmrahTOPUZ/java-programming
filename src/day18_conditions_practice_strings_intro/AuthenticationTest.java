package day18_conditions_practice_strings_intro;

public class AuthenticationTest {
    public static void main(String[] args) {
         int last4SSN = 1234;
         int pinCode = 2425;

         int expLast4SSN = 134;
         int expPinCode = 235;

        if (last4SSN == expLast4SSN || pinCode == expPinCode) {
            System.out.println("Authentaication successful");
        } else {
            System.out.println("Authentication unsuccessful");
            if (last4SSN != expLast4SSN) {
                System.out.println("Last 4 ssn number unsuccessful");
            } if (pinCode != expPinCode) {
                System.out.println("Pincode is unmatched");
            }
        }
    }
}

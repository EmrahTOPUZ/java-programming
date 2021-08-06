package Officehours;

public class alex_test_class {

    public static String name (String Alex){

        String abc = "abc";

        String retStr = "";

        for (int i = 0; i < Alex.length(); i++) {
            for (int j = 0; j < abc.length() ; j++) {
                if (Alex.charAt(i) == abc.charAt(j)) {
                    retStr += Alex.charAt(i);
                }
            }
        }
            return retStr;

    }
}

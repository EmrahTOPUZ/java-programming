package day53_inheritance.final_keyword;

public class TestData {

    /**
     * TestData class that has a list of Constants
     * Values of below variables cannot be changed anywhere
     * Constant variables always upper case letter and seperated by the under_score
     */
    public static final String ADMIN_USERNAME = "admin";
    public static final String ADMIN_PASSWORD = "password1234";
    public static final int MAX_WAIT_TIME = 60;
    public static final boolean STOP_IF_FAIL = true;

}

/**
 * Error: Cannot inherit from final class
 */
//class Chils extends TestData {



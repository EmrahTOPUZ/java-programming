package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("---Starting Etsy Search Smoke test---");
        openBrowser();
        navigateToUrl();
        searchForWoodenSpoon();
        verifySearchResultAreDisplayed();
    }

    public static void  openBrowser() {
        System.out.println("Launching Chrome Browser ");
    }

    public static void navigateToUrl() {
        System.out.println("Navigate to https;//www.etsy.com ");
    }

    public static void searchForWoodenSpoon () {
        System.out.println("Pass: Verify Etsy home page is displayed");
        System.out.println("Type: 'Wooden Spoon' in the search box and click search");
    }

    public static void verifySearchResultAreDisplayed () {
        System.out.println("Pass: Verify search result are displayed");
    }
}

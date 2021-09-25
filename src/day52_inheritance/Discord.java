package day52_inheritance;

public class Discord extends MobileApp {

    public void chat(String someone) {
        System.out.println("Chatting with " + someone + " on discord");
    }

    /**
     Override download method
     */


    @Override
    protected boolean download(){
        System.out.println("Downloaded Discord from app store");
        return true;
    }

    @Override
    public void useTheApp (int minutes) {
        super.useTheApp(minutes);
        chat("ZoeShade");
    }

    public void printInfo() {
        System.out.println("App name = " +getName());
        System.out.println("App version= " +getVersion());
    }


}

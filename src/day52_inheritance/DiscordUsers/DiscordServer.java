package day52_inheritance.DiscordUsers;

public class DiscordServer {
    public static void main(String[] args) {


        GeneralUser user = new GeneralUser();
        user.setId(6767);
        user.setName("Emrah");
        user.setRole("Student");

        Admin admin = new Admin();
        admin.setId(1234);
        admin.setName("Hayati");
        admin.setRole("Usta");

        System.out.println(user);
        System.out.println(admin);
    }
}

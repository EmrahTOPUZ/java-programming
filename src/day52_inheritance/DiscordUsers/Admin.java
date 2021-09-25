package day52_inheritance.DiscordUsers;

public class Admin extends GeneralUser{

    public Admin() {
        super(); // all super class no args constructorq. super only work inside oof the constructor
        System.out.println("Admin class constructor");
    }

    public Admin(String name, int id) {
        super("Admin" , name, id);
        System.out.println("Admin class 2 args constructor");
    }

    @Override
    public String toString() {
        return "Admin{" +
                "role='" + getRole()+ '\'' +
                ", name='" + getName()+ '\'' +
                ", id=" + getId() +
                '}';
    }

}

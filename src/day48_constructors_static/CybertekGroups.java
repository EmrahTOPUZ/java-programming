package day48_constructors_static;

import com.sun.xml.internal.ws.api.pipe.Engine;

import java.util.ArrayList;
import java.util.Arrays;

public class CybertekGroups {

    public static void main(String[] args) {

        Group group1 = new Group("Jack");
        System.out.println(group1.getMembers().size());
        group1.addMember("Emrah");
        group1.addMember("Alex");
        group1.addMember("Jamilya");
        group1.addMember("Edgar");
        group1.addMember("Umid");
        group1.addMember("Murtiza");
        group1.addMember("Mustafa");
        System.out.println(group1.getMembers().size());
        System.out.println(group1.getMembers());
        System.out.println(group1.toString());

        Group group2 = new Group("Jones");
        group2.setMembers(Arrays.asList("Taylan" , "Halil" , "Berk" , "Fatih" , "Kerem" , "Daigne" , "Belhanda"));
        System.out.println("Group 2 members = " + group2.getMembers());
        if (group2.getMembers().contains("Taylan")) {
            System.out.println("Taylan is playing tonight");
        } else {
            System.out.println("Taylan is not playing tonight");
        }

        //remove some members group1

        group1.removeMember("Edgar");
        group1.removeMember("Jamilya");
        System.out.println(group1);

    }


}

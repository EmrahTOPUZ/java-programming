package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private List<String> members = new ArrayList<>();

    public Group(String name) {
        this.name = name;
        members = new ArrayList<>();
    }

    public void addMember(String newMember) {
        members.add(newMember);
    }

    public void removeMember(String name) {
        members.remove(name);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", members=" + members +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

}

package day47_constructors;

public class Student {
    public Student () {
        System.out.println("No-Args constructor");
    }
        //constructor
    public Student (String name){
        System.out.println("name param constructor | name = " + name);
    }

    public Student (String name, int age){
        System.out.println("Nasiba's name and age = " + name +" " + age);
    }
}

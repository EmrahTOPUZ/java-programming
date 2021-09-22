package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bakyt";
        p1.age = 30;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Saim";
        t1.age = 25;
        t1.talk();
        t1.teach("how to get fucked up");


        Student student = new Student();
        student.name = "Emrah";
        student.age = 34;
        student.talk();
        student.walk();
        student.work("Selenium automation testing");
        student.school = "Cybertekschool";
        student.study("Java programming inheritance");


    }
}

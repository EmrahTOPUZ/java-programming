package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        String [] student = new String[5]; // if the values are not ready to use , the way to go
        student[0] = "AD1234";
        student[1] = "Adam";
        student[2] = "Smith";
        student[3] = "B22";
        student[4] = "202-543-1234";

        // if we know the values already thats the way to go
        String [] student1 = { "123456", "Emrah", "Topuz", "Batch22", "9099279620"};

        System.out.println("Student id = " +student[0]);
        System.out.println("Student firstName = " +student[1]);
        System.out.println("Student lastName = " +student[2]);
        System.out.println("Student batch number = " +student[3]);
        System.out.println("Student phone number = " +student[4]);

        System.out.println("student data length : " +student.length);

        if (student.length == 5) {
            System.out.println("True Pass data array has correct length");
        }else{
            System.out.println("False fail data array has incorrect length");
        }

        if (student.length == student1.length) {
            System.out.println("True Pass = data arrays length match");
        }else{
            System.out.println("False Fail = data arrays length not match");
        }

        System.out.println(student[1].toUpperCase() + " " + student[2].toUpperCase());

        String mobileNum = student1[4];
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("909"));

    }
}

package day54_abstraction;

/**
 * -> we add abstract keyword to a class to make it an abstract class.
 * -> we cannot create object of Student class- meaning:
 *     - Student student = new Student(); will show error
 * ->
 */

public abstract class Student {

    public void code(String language) {
        System.out.println("Student is coding using " + language);
    }

    public abstract void attendClass();

}






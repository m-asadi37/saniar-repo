package pack1;

public class Student extends Person {

    public Student(String name, String code) {
        super(name, code);
    }

    @Override
    public void doWork() {
        System.out.println("learning...");
    }
}

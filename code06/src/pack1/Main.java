package pack1;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("ali", "ahmadi");

        s1.doWork();
        s1.doPersonalWork();

        Person p1 = new Person();
        p1.doWork();
    }
}

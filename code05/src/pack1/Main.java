package pack1;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setName("John");
        p1.setAge(30);
        p1.doWork();

        Student s1 = new Student();
        s1.setName("Jey");
        s1.setAge(32);
        s1.doWork();

        Teacher t1 = new Teacher();
        t1.setName("Joo");
        t1.setAge(33);
        t1.doWork();
    }
}
